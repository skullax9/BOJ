import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.Collectors;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		int N = fr.nextInt();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			String[] sp = fr.nextLine().split("-");

			String[] word = sp[0].split("");

			int sum = 0;
			int len = word.length - 1;

			for (int j = 0; j < word.length; j++) {
				sum += alpha.indexOf(word[j]) * Math.pow(26, len - j);
			}

			int abs = Math.abs(sum - parse(sp[1]));

			sb.append(abs <= 100 ? "nice" : "not nice").append("\n");
		}

		System.out.println(sb);

	}

	public static int parse(String str) {
		return Integer.parseInt(str);
	}

	public static String toStr(int i) {
		return String.valueOf(i);
	}

	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		public FastReader(String s) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(new File(s)));
		}
		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

}

import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.Collectors;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		String[] sp = fr.nextLine().split(" ");

		int len = sp[0].length();

		int sero = -1;
		int correct = -1;

		int connect = Math.max(len, sp[1].length());

		for (int i = 0; i < len; i++) {
			String cs = String.valueOf(sp[0].charAt(i));
			if (sp[1].indexOf(cs) != -1) {
				sero = i;
				correct = sp[1].indexOf(cs);
				break;
			}
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < connect; i++) {
			if (i == correct) {
				sb.append(sp[0]).append("\n");
			} else {
				if (i >= sp[1].length()) break;

				String[] word = new String[len];

				Arrays.fill(word, ".");

				word[sero] = String.valueOf(sp[1].charAt(i));

				sb.append(String.join("", word)).append("\n");
			}
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

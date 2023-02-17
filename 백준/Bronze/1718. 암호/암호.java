import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.Collectors;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		StringBuilder sb = new StringBuilder();

		String[] seq = fr.nextLine().split("");
		String key = fr.nextLine();

		int repeat = seq.length / key.length() + 1;

		String[] secert = key.repeat(repeat).substring(0, seq.length).split("");

		String alpha = "0abcdefghijklmnopqrstuvwxyz";

		for (int i = 0; i < secert.length; i++) {
			if (seq[i].isBlank()) {
				sb.append(seq[i]);
				continue;
			}

			int keyIndex = alpha.indexOf(secert[i]);
			int seqIndex = alpha.indexOf(seq[i]);
			int index = seqIndex - keyIndex;

			index = index <= 0 ? index + 26 : index;

			sb.append(alpha.charAt(index));
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

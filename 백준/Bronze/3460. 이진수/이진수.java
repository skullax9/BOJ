import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		int T = fr.nextInt();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < T; i++) {
			int n = fr.nextInt();

			StringBuilder binary = new StringBuilder(Integer.toBinaryString(n)).reverse();

			for (int j = 0; j < binary.length(); j++) {
				if (binary.charAt(j) == '1') {
					sb.append(j).append(" ");
				}
			}
			sb.append("\n");
		}

		System.out.println(sb);
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

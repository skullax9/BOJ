import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		StringBuilder sb = new StringBuilder();

		int cnt = 1;

		while (true) {
			int a = fr.nextInt();
			int b = fr.nextInt();
			int c = fr.nextInt();

			if (a == 0 && b == 0 && c == 0) break;

			sb.append("Triangle #").append(cnt++).append("\n");

			if (c == -1) {
				sb.append("c = ").append(String.format("%.3f", Math.sqrt(a * a + b * b))).append("\n");
			} else if (a >= c || b >= c) {
				sb.append("Impossible.").append("\n");
			} else if (a == -1) {
				sb.append("a = ").append(String.format("%.3f", Math.sqrt(c * c - b * b))).append("\n");
			} else if (b == -1) {
				sb.append("b = ").append(String.format("%.3f", Math.sqrt(c * c - a * a))).append("\n");
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

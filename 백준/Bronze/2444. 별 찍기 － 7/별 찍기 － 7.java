import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		int N = fr.nextInt();
		int totalLen = (2 * N) - 1;

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= N - 1; i++) {
			int len = (2 * i) - 1;

			String star = "*".repeat(len);
			String space = " ".repeat((totalLen - len) / 2);

			sb.append(space).append(star).append("\n");
		}

		sb.append("*".repeat(totalLen)).append("\n");

		for (int i = N - 1; i >= 1; i--) {
			int len = (2 * i) - 1;

			String star = "*".repeat(len);
			String space = " ".repeat((totalLen - len) / 2);

			sb.append(space).append(star).append("\n");
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

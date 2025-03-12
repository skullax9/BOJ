import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		int N = fr.nextInt();

		StringBuilder sb =  new StringBuilder();
		List<String> list = new ArrayList<>();

		for (int i = 1; i <= N; i++) {
			if (i == N) {
				sb.append("*".repeat(i * 2)).append("\n");
				for (int j = list.size() - 1; j >= 0; j--) {
					sb.append(list.get(j));
				}
			} else {
				list.add("*".repeat(i) + " ".repeat(N * 2- (i * 2)) + "*".repeat(i) + "\n");
				sb.append("*".repeat(i)).append(" ".repeat(N * 2 - (i * 2))).append("*".repeat(i)).append("\n");
			}
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

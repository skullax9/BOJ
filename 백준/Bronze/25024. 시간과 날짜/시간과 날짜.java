import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		StringBuilder sb = new StringBuilder();

		int T = fr.nextInt();

		for (int i = 0; i < T; i++) {
			int x = fr.nextInt();
			int y = fr.nextInt();

			try {
				LocalTime date = LocalTime.of(x, y);

				sb.append("Yes ");
			} catch (Exception e) {
				sb.append("No ");
			}

			try {
				LocalDate date = LocalDate.of(2024, x, y);

				sb.append("Yes");
			} catch (Exception e) {
				sb.append("No");
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

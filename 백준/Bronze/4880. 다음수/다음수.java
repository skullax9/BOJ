import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		StringBuilder sb = new StringBuilder();


		while (true) {
			int a1 = fr.nextInt();
			int a2 = fr.nextInt();
			int a3 = fr.nextInt();

			if (a1 == 0 && a2 == 0 && a3 == 0) break;

			if (a2 - a1 == a3 - a2) {
				sb.append("AP ").append(a3 + (a2 - a1)).append("\n");
			} else {
				sb.append("GP ").append(a3 * (a2 / a1)).append("\n");
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

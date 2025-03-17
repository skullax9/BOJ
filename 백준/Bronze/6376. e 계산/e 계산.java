import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		StringBuilder sb = new StringBuilder();

		sb.append("n e").append("\n");
		sb.append("- -----------").append("\n");
		sb.append("0 1").append("\n");
		sb.append("1 2").append("\n");
		sb.append("2 2.5").append("\n");

		double val = 2.5;
		int fac = 2;

		for (int i = 3; i <= 9; i++) {
			sb.append(i).append(" ");

			double fac2 = fac * i;

			val += 1.0 / fac2;

			sb.append(String.format("%.9f",val)).append("\n");

			fac = (int) fac2;
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

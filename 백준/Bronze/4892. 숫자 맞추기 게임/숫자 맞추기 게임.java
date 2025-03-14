import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		StringBuilder sb = new StringBuilder();
		int i = 1;

		while(true) {
			int N = fr.nextInt();

			if (N == 0) break;

			sb.append(i++).append(". ").append(N % 2 == 0 ? "even " : "odd ");

			for (int j = 1; j <= 4; j++) {
				if (j == 1) N *= 3;
				if (j == 2) {
					N = N % 2 == 0 ? N / 2 : (N + 1) / 2;
				}
				if (j == 3) N *= 3;
				if (j == 4) N /= 9;
			}

			sb.append(N).append("\n");
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

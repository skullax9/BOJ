import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		StringBuilder sb = new StringBuilder();

		int L = fr.nextInt();
		int R = fr.nextInt();
		int A = fr.nextInt();

		if (L == R) {
			int max = (L + (A / 2)) + (R + (A / 2));
			System.out.println(max);
		} else {
			int max = Math.max(L, R);
			int min = Math.min(L, R);

			if (A > max - min) {
				A -= max - min;
				min += max - min;

				max += A / 2;
				min += A / 2;
			} else {
				min += A;
			}

			System.out.println(Math.min(max, min) * 2);
		}
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

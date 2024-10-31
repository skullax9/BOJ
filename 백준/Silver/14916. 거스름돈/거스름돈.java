import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
import java.util.concurrent.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		int n = fr.nextInt();

		if (n == 1 || n == 3) {
			System.out.println(-1);
		} else {
			int five = n / 5;
			int another = n % 5;

			if (another == 0) {
				System.out.println(five);
			} else {
				int two = another / 2;
				int twoAnother = another % 2;

				if (twoAnother != 0) {
					five = five - 1;
					another = another + 5;

					two = another / 2;
				}
				System.out.println(five + two);
			}
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

import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		StringBuilder sb = new StringBuilder();

		int N = fr.nextInt();

		BigInteger bigInteger = BigInteger.ZERO;

		for (long i = N; i < (long) N * N; i++) {
			if (i / N == i % N) {
				bigInteger = bigInteger.add(new BigInteger(String.valueOf(i)));
				i += N;
			}
		}

		System.out.println(bigInteger);
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

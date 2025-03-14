import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		String[] split = fr.nextLine().split(" ");

		String A = split[0];
		String B = split[1];

		BigInteger max = new BigInteger(A).max(new BigInteger(B));
		BigInteger min = new BigInteger(A).min(new BigInteger(B));

		BigInteger count = BigInteger.ZERO;
		StringBuilder sb = new StringBuilder();

		while (true) {
			if (min.equals(max) || max.subtract(min).equals(BigInteger.ONE)) break;

			min = min.add(BigInteger.ONE);

			count = count.add(BigInteger.ONE);
			sb.append(min).append(" ");
		}

		System.out.println(count);
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

import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		StringBuilder sb = new StringBuilder();

		List<Integer> list = new ArrayList<>();

		int M = fr.nextInt();

		list.add(0);
		list.add(1);
		list.add(0);
		list.add(0);

		for (int i = 0; i < M; i++) {
			int X = fr.nextInt();
			int Y = fr.nextInt();

			list.set(0, list.get(X));
			list.set(X, list.get(Y));
			list.set(Y, list.get(0));
			list.set(0, 0);
		}

		for (int i = 0; i < 4; i++) {
			if (list.get(i) == 1) System.out.println(i);
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

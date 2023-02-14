import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		int A = fr.nextInt();
		int B = fr.nextInt();

		int N = fr.nextInt();

		final int gap = Math.max(A, B) - Math.min(A, B);

		int count = 1;

		List<Integer> favorite = new ArrayList<>();

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < N; i++) {
			int mhz = fr.nextInt();

			min = Math.min(min, Math.max(B, mhz) - Math.min(B, mhz));

			favorite.add(mhz);
		}

		if (count + min > gap) {
			System.out.println(gap);
		} else {
			System.out.println(min + count);
		}
	}

	public static int parse(String str) {
		return Integer.parseInt(str);
	}

	public static String toStr(int i) {
		return String.valueOf(i);
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

import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		int N = fr.nextInt();
		int M = fr.nextInt();

		List<Integer> list = new ArrayList<>();

		int least = M - 1;
		int sum = 0;

		for (int i = 0; i < M; i++) {
			int A = fr.nextInt();
			int B = fr.nextInt();

			if (A >= N) {
				least--;
			} else {
				list.add(N - A);
			}
		}

		Collections.sort(list);

		for (int i = 0; i < least; i++) {
			sum += list.get(i);
		}

		System.out.println(sum);
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

import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		StringBuilder sb = new StringBuilder();

		long N = fr.nextLong();

		List<Long> list = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			list.add(fr.nextLong());
		}

		boolean isPlus = list.get(1) - list.get(0) == list.get(2) - list.get(1);

		if (isPlus) {
			sb.append(list.get(list.size() - 1) + (list.get(1) - list.get(0)));
		} else {
			sb.append(list.get(list.size() - 1) * (list.get(1) / list.get(0)));	
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

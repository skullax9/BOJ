import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		StringBuilder sb = new StringBuilder();

		while (true) {
			HashMap<Integer, Integer> map = new HashMap<>();

			int N = fr.nextInt();
			int M = fr.nextInt();
			int sum = 0;

			if (N == M && M == 0) break;

			for (int i = 0; i < N; i++) {
				map.put(fr.nextInt(), 0);
			}

			for (int i = 0; i < M; i++) {
				sum += map.containsKey(fr.nextInt()) ? 1 : 0;
			}

			sb.append(sum).append("\n");
		}

		System.out.println(sb);
	}

	private static String str(char c) {
		return String.valueOf(c);
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

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		StringBuilder sb = new StringBuilder();

		int T = fr.nextInt();

		for (int i = 0; i < T; i++) {
			Hashtable<Integer, Integer> table = new Hashtable<>();

			int N = fr.nextInt();

			for (int j = 0; j < N; j++) {
				int key = fr.nextInt();
				table.put(key, key);
			}

			int M = fr.nextInt();

			for (int j = 0; j < M; j++) {
				boolean has = table.containsKey(fr.nextInt());
				sb.append(has ? 1 : 0).append("\n");
			}
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

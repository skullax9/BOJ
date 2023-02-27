import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		StringBuilder sb = new StringBuilder();

		int N = fr.nextInt();
		int M = fr.nextInt();

		Hashtable<Integer, Integer> table = new Hashtable<>();

		for (int i = 0; i < N; i++) {
			int n = fr.nextInt();
			table.put(n, n);
		}

		for (int i = 0; i < M; i++) {
			int n = fr.nextInt();
			table.remove(n, n);
		}

		if (table.isEmpty()) {
			System.out.println(0);
		} else {
			sb.append(table.size()).append("\n");
			
			table.values().stream().sorted().forEach(f -> sb.append(f).append(" "));
			
			System.out.println(sb);
		}
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

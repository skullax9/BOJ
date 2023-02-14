import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		int T = fr.nextInt();

		StringBuilder ans = new StringBuilder();

		for (int i = 0; i < T; i++) {
			int N = fr.nextInt();

			String[] alphas = fr.nextLine().split(" ");

			Deque<String> deque = new ArrayDeque<>();

			StringBuilder sb = new StringBuilder();

			deque.addFirst(alphas[0]);

			for (int j = 1; j < alphas.length; j++) {
				char c = deque.peek().charAt(0);

				if (c >= alphas[j].charAt(0)) {
					deque.addFirst(alphas[j]);
				} else {
					deque.addLast(alphas[j]);
				}

			}

			while (!deque.isEmpty()) {
				sb.append(deque.pollFirst());
			}

			ans.append(sb).append("\n");
		}

		System.out.println(ans);
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

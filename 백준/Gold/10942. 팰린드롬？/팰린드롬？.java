import java.io.*;
import java.util.*;

class Main {
	static int[][] dp = new int[2000][2001];
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		int N = fr.nextInt();
		int[] nums = new int[N];

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			nums[i] = fr.nextInt();
		}

		int M = fr.nextInt();

		for (int i = 0; i < M; i++) {
			int pre = fr.nextInt() - 1;
			int suff = fr.nextInt() - 1;

			if (dp[pre][suff] != 0) {
				sb.append(dp[pre][suff] == -1 ? 0 : 1).append("\n");

				continue;
			}

			int start = pre;
			int end = suff;

			int len = (suff - pre) + 1;
			int std = len % 2 == 0 ? len / 2 : (len / 2) + 1;

			for (int j = 0; j < std; j++) {
				if (nums[start++] != nums[end--]) {
					dp[pre][suff] = -1;
					break;
				}
			}

			sb.append(dp[pre][suff] == -1 ? 0 : 1).append("\n");
		}

		System.out.println(sb);
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

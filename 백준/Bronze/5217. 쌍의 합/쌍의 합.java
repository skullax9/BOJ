import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		StringBuilder sb = new StringBuilder();

		int lim = fr.nextInt();

		for (int i = 0; i < lim; i++) {
			int N = fr.nextInt();

			Set<String> set = new HashSet<>();

			sb.append("Pairs for ").append(N).append(": ");

			for (int j = 1; j <= 12; j++) {
				for (int k = 1; k <= 12; k++) {
					if (j == k) continue;
					if (j + k == N && !set.contains(Math.max(j, k) + " " + Math.min(j , k))) {
						sb.append(j).append(" ").append(k).append(", ");
						set.add(Math.max(j, k) + " " + Math.min(j , k));
					}
				}
			}
			sb.replace(sb.length() - (!set.isEmpty() ? 2 : 1), sb.length(), "");
			if (i != lim - 1) sb.append("\n");
		}

		String ans = sb.toString().trim();

		System.out.println(ans);
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

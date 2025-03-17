import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		StringBuilder sb = new StringBuilder();

		Map<String, Integer> map = new HashMap<>();

		map.put("P P", 0);
		map.put("R R", 0);
		map.put("S S", 0);
		map.put("P S", -1);
		map.put("P R", 1);
		map.put("R P", -1);
		map.put("R S", 1);
		map.put("S P", 1);
		map.put("S R", -1);

		int t = fr.nextInt();

		for (int i = 0; i < t; i++) {
			int n = fr.nextInt();

			int sum = 0;

			for (int j = 0; j < n; j++) {
				sum += map.get(fr.nextLine());
			}

			if (sum > 0) sb.append("Player 1\n");
			if (sum < 0) sb.append("Player 2\n");
			if (sum == 0) sb.append("TIE\n");
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

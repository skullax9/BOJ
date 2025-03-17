import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		int N = fr.nextInt();

		int ans = -1;

		for (int i = 0; i < N; i++) {
			String[] split = fr.nextLine().split(" ");

			Map<String, Integer> map = new HashMap<>();

			for (String num : split) {
				if (map.containsKey(num)) map.put(num, map.get(num) + 1);
				else map.put(num, 1);
			}

			Set<String> set = new HashSet<>(Arrays.asList(split));

			if (set.size() == 1) {
				ans = Math.max(ans, Integer.parseInt(split[0]) * 5000 + 50000);
			} else if (set.size() == 2) {
				boolean isCouple = true;

				for (String s : set) {
					isCouple = isCouple && map.get(s) == 2;
				}

				int max = -1;
				int min = 7;

				if (isCouple) { // 2개 2개
					for (String s : set) {
						max = Math.max(max, Integer.parseInt(s));
						min = Math.min(min, Integer.parseInt(s));
					}

					ans = Math.max(ans, (2000 + (max * 500)) + (min * 500));
				} else { // 3개 1개
					for (String s : set) {
						if (map.get(s) == 3) max = Integer.parseInt(s);
					}

					ans = Math.max(ans, 10000 + (max * 1000));
				}
			} else if (set.size() == 3) {
				int max = -1;

				for (String s : set) {
					if (map.get(s) == 2) max = Integer.parseInt(s);
				}

				ans = Math.max(ans, 1000 + (max * 100));
			} else {
				int max = -1;

				for (String s : set) {
					max = Math.max(max, Integer.parseInt(s));
				}

				ans = Math.max(ans, max * 100);
			}
		}
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

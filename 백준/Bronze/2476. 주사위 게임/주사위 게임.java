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
				ans = Math.max(ans, Integer.parseInt(split[0]) * 1000 + 10000);
			} else if (set.size() == 2) {
				for (String key : map.keySet()) if (map.get(key) == 2) ans = Math.max(ans, Integer.parseInt(key) * 100 + 1000);
			} else {
				int max = Math.max(-1, Integer.parseInt(split[0]));
				max = Math.max(max, Integer.parseInt(split[1]));
				max = Math.max(max, Integer.parseInt(split[2]));
				
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

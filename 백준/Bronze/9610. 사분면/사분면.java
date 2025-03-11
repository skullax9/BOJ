import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		int n = fr.nextInt();
		
		StringBuilder sb = new StringBuilder();
		Map<String, Integer> map = new HashMap<>();
		
		map.put("Q1", 0);
		map.put("Q2", 0);
		map.put("Q3", 0);
		map.put("Q4", 0);
		map.put("AXIS", 0);
		
		for (int i = 0; i < n; i++) {
			String[] split = fr.nextLine().split(" ");
			
			int x = Integer.parseInt(split[0]);
			int y = Integer.parseInt(split[1]);
			
			if (x == 0 || y == 0) map.put("AXIS", map.get("AXIS") + 1);
			if (x > 0 && y > 0) map.put("Q1", map.get("Q1") + 1);
			if (x < 0 && y > 0) map.put("Q2", map.get("Q2") + 1);
			if (x < 0 && y < 0) map.put("Q3", map.get("Q3") + 1);
			if (x > 0 && y < 0) map.put("Q4", map.get("Q4") + 1);
		}
		
		for (String key : map.keySet()) {
			sb.append(key).append(": ").append(map.get(key)).append("\n");
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

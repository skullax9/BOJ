import java.io.*;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		Map<String, Integer> x = new HashMap<>();
		Map<String, Integer> y = new HashMap<>();
		
		for (int i = 0; i < 3; i++) {
			String[] st = fr.nextLine().split(" ");
			
			if (x.containsKey(st[0])) {
				x.replace(st[0], 2);	
			}
			if (!x.containsKey(st[0])) {
				x.put(st[0], 1);
			}
			
			if (y.containsKey(st[1])) {
				y.replace(st[1], 2);	
			}
			if (!y.containsKey(st[1])) {
				y.put(st[1], 1);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (String key : x.keySet()) {
			if (x.get(key) == 1) sb.append(key).append(" ");
		}
		
		for (String key : y.keySet()) {
			if (y.get(key) == 1) sb.append(key);
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

import java.io.*;
import java.math.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		int n = fr.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			int p = fr.nextInt();
			
			SortedSet<Integer> set = new TreeSet<>();
			Map<Integer, String > map = new HashMap<>();
			
			for (int j = 0; j < p; j++) {
				String[] sp = fr.nextLine().split(" ");
				
				set.add(parse(sp[0]));
				
				map.put(parse(sp[0]), sp[1]);
			}
			
			sb.append(map.get(set.last())).append("\n");
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

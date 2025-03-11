import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		int n = fr.nextInt();
		int a = 100;
		int b = 100;
		
		for (int i = 0; i < n; i++) {
			String[] scores = fr.nextLine().split(" ");
			
			int c = Integer.parseInt(scores[0]);
			int d = Integer.parseInt(scores[1]);
			
			if (c > d) {
				b -= c;
			}
			if (c < d) {
				a -= d;
			}
		}

		System.out.println(a);
		System.out.println(b);
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

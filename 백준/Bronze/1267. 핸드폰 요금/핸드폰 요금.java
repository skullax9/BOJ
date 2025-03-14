import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		int N = fr.nextInt();

		int Y = 0;
		int M = 0;

		for (int i = 0; i < N; i++) {
			int sum = fr.nextInt();

			Y += ((sum / 30) * 10) + 10;
			M += ((sum / 60) * 15) + 15;
		}

		if (Y > M) {
			System.out.println("M " + M);
		} else if (M > Y){
			System.out.println("Y " + Y);
		} else {
			System.out.println("Y M " + Y);
		}
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

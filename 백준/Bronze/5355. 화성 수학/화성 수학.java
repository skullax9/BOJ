import java.io.*;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		int T = fr.nextInt();

		for (int i = 0; i < T; i++) {
			String[] split = fr.nextLine().split(" ");

			double std = Double.parseDouble(split[0]);

			for (int j = 1; j < split.length; j++) {
				if (split[j].equals("@")) std *= 3;
				if (split[j].equals("%")) std += 5;
				if (split[j].equals("#")) std -= 7;
			}

			System.out.println(new DecimalFormat("#.00").format(std));
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

import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.Collectors;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		int[] balls = {1, 0, 0};

		String[] sp = fr.nextLine().split("");

		for (String s : sp) {
			if (s.equals("A")) {
				if (balls[0] == 1) {
					balls[1] = 1;
					balls[0] = 0;
					continue;
				}
				if (balls[1] == 1) {
					balls[0] = 1;
					balls[1] = 0;
					continue;
				}
			}
			if (s.equals("B")) {
				if (balls[1] == 1) {
					balls[2] = 1;
					balls[1] = 0;
					continue;
				}
				if (balls[2] == 1) {
					balls[1] = 1;
					balls[2] = 0;
					continue;
				}
			}
			if (s.equals("C")) {
				if (balls[0] == 1) {
					balls[2] = 1;
					balls[0] = 0;
					continue;
				}
				if (balls[2] == 1) {
					balls[0] = 1;
					balls[2] = 0;
				}
			}
		}

		for (int i = 0; i < 3; i++) {
			if (balls[i] == 1) {
				System.out.println(i + 1);
			}
		}
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

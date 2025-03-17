import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		int R = fr.nextInt();
		int C = fr.nextInt();
		int ZR = fr.nextInt();
		int ZC = fr.nextInt();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < R; i++) {
			String[] split = fr.nextLine().split("");

			StringBuilder sb2 = new StringBuilder();

			for (String s : split) {
				sb2.append(s.repeat(ZC));
			}

			sb2.append("\n");

			sb.append(sb2.toString().repeat(ZR));
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

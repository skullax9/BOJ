import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		String str = fr.nextLine();

		List<String> list = Arrays.stream(str.split("[.]")).filter(f -> !f.isEmpty()).collect(Collectors.toList());

		long count = list.stream().filter(f -> f.length() % 2 == 1).count();

		if (count > 0) {
			System.out.println(-1);
		} else {
			StringBuilder sb = new StringBuilder();

			int xCount = 0;
			int dotCount = 0;

			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'X') {
					xCount++;

					if (dotCount > 0) {
						sb.append(".".repeat(dotCount));
						dotCount = 0;
					}
				}
				if (str.charAt(i) == '.') {
					dotCount++;

					if (xCount > 0) {
						int aaaa = xCount / 4;
						int bb = xCount % 4 > 0 ? 1 : 0;

						sb.append("AAAA".repeat(aaaa)).append("BB".repeat(bb));
						xCount = 0;
					}
				}
			}

			if (dotCount > 0) {
				sb.append(".".repeat(dotCount));
			} else if (xCount > 0) {
				int aaaa = xCount / 4;
				int bb = xCount % 4 > 0 ? 1 : 0;

				sb.append("AAAA".repeat(aaaa)).append("BB".repeat(bb));
			}

			System.out.println(sb);
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

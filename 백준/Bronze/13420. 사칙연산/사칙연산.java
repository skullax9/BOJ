import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.Collectors;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		StringBuilder sb = new StringBuilder();

		int T = fr.nextInt();

		for (int i = 0; i < T; i++) {
			String[] sp = fr.nextLine().split(" ");

			long num1 = parse(sp[0]);
			long num2 = parse(sp[2]);
			long ans = parse(sp[4]);

			if (sp[1].equals("*")) {
				sb.append(num1 * num2 == ans ? "correct" : "wrong answer");
			}

			if (sp[1].equals("+")) {
				sb.append(num1 + num2 == ans ? "correct" : "wrong answer");
			}

			if (sp[1].equals("-")) {
				sb.append(num1 - num2 == ans ? "correct" : "wrong answer");
			}

			if (sp[1].equals("/")) {
				sb.append(num1 / num2 == ans ? "correct" : "wrong answer");
			}

			sb.append("\n");
		}

		System.out.println(sb);
	}

	public static long parse(String str) {
		return Long.parseLong(str);
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

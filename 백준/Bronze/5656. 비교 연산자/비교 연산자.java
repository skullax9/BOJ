import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.Collectors;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		StringBuilder sb = new StringBuilder();

		int cnt = 1;

		while (true) {
			String[] sp = fr.nextLine().split(" ");

			if (sp[1].equals("E")) break;

			sb.append("Case ").append(cnt++).append(": ");

			int num1 = parse(sp[0]);
			int num2 = parse(sp[2]);

			if (sp[1].equals(">")) {
				sb.append(num1 > num2);
			}
			if (sp[1].equals(">=")) {
				sb.append(num1 >= num2);
			}
			if (sp[1].equals("<")) {
				sb.append(num1 < num2);
			}
			if (sp[1].equals("<=")) {
				sb.append(num1 <= num2);
			}
			if (sp[1].equals("==")) {
				sb.append(num1 == num2);
			}
			if (sp[1].equals("!=")) {
				sb.append(num1 != num2);
			}

			sb.append("\n");
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

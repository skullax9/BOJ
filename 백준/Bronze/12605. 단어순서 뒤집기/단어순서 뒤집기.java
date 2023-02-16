import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		int N = fr.nextInt();

		StringBuilder sb = new StringBuilder();

		Stack<String> stack = new Stack<>();

		for (int i = 0; i < N; i++) {
			String[] sp = fr.nextLine().split(" ");

			for (int j = 0; j < sp.length; j++) {
				stack.push(sp[j]);
			}

			sb.append("Case #").append(i + 1).append(": ");

			for (int j = 0; j < sp.length; j++) {
				sb.append(stack.pop()).append(" ");
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

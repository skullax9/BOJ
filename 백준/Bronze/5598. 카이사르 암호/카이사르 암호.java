import java.io.*;
import java.math.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String caesar = "DEFGHIJKLMNOPQRSTUVWXYZABC";

		String[] arr = fr.nextLine().split("");

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < arr.length; i++) {
			sb.append(alpha.charAt(caesar.indexOf(arr[i])));
		}

		System.out.println(sb);
 	}

	public static String convert(String str) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'A') {
				sb.append("B");
			} else {
				sb.append("A");
			}
		}

		return sb.toString();
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

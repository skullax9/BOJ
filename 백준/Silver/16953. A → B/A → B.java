import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		int A = fr.nextInt();
		int B = fr.nextInt();

		int sum = 1;

		String str = toStr(B);

		while (true) {
			if (B == A || B == 0) break;

			if (B < A) {
				sum = -1;
				break;
			}

			if (str.charAt(str.length() - 1) == '1') {
				str = str.substring(0, str.length() - 1);
				B = parse(str);
				sum++;
			} else if (B % 2 == 0) {
				B /= 2;
				str = toStr(B);
				sum++;
			} else {
				sum = -1;
				break;
			}
		}

		System.out.println(sum);

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

import java.io.*;
import java.util.*;

class Main {
	static int[][] dp = new int[2000][2001];
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		int a = fr.nextInt();
		int b = fr.nextInt();

		boolean[] arr = new boolean[b + 1];

		makePrime(arr , b);

		StringBuilder sb = new StringBuilder();

		for (int i = a; i < arr.length; i++) {
			if (i > b) break;

			if (!arr[i]) {
				String str = toStr(i);

				int len = str.length();
				int std = len % 2 == 0 ? len / 2 : (len / 2) + 1;
				int start = 0;
				int end = len - 1;

				boolean isPalindrome = true;

				for (int j = 0; j < std; j++) {
					if (str.charAt(start++) != str.charAt(end--)) {
						isPalindrome = false;
						break;
					}
				}

				if (isPalindrome) {
					sb.append(i).append("\n");
				}
			}
		}

		sb.append(-1);

		System.out.println(sb);
	}

	public static void makePrime(boolean[] arr,int N) {
		if (N < 2) return;

		arr[0] = arr[1] = true;

		for (int i = 2; i <= Math.sqrt(N); i++) {
			if (arr[i]) continue;

			for (int j = i * i; j < arr.length; j = j + i) {
				arr[j] = true;
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

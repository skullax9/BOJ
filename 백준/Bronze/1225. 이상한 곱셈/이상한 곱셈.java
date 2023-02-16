import java.io.*;
import java.math.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		String[] AB = fr.nextLine().split(" ");
		
		int[] A = Arrays.stream(AB[0].split("")).mapToInt(Integer::parseInt).toArray();
		int[] B = Arrays.stream(AB[1].split("")).mapToInt(Integer::parseInt).toArray();

		long sum = 0;

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				sum += A[i] * B[j];
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

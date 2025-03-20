import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		StringBuilder sb = new StringBuilder();

		int N = fr.nextInt();
		int[] size = new int[6];

		for (int i = 0; i < 6; i++) {
			size[i] = fr.nextInt();
		}
		
		int T = fr.nextInt();
		int P = fr.nextInt();
		int tSum = 0;
		
		for (int i : size) {
			tSum += i / T;
			tSum += i % T > 0 ? 1 : 0;
		}
		
		sb.append(tSum).append("\n").append(N / P).append(" ").append(N % P);

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

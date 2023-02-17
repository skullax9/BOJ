import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		int N = fr.nextInt();

		String[][] sero = new String[N][N];

		StringBuilder sb = new StringBuilder();

		int ㅡ = 0;
		int ㅣ = 0;

		for (int i = 0; i < N; i++) {
			String[] str = fr.nextLine().split("");

			int possible = 0;

			for (int j = 0; j < str.length; j++) {
				if (str[j].equals("X")) {
					if (possible > 1) ㅡ++;
					possible = 0;
				} else {
					possible++;
				}
				sero[j][i] = str[j];
			}

			if (possible > 1) ㅡ++;
		}

		sb.append(ㅡ).append(" ");

		for (int i = 0; i < sero.length; i++) {
			int possible = 0;

			for (int j = 0; j < sero[i].length; j++) {
				if (sero[i][j].equals("X")) {
					if (possible > 1) ㅣ++;
					possible = 0;
				} else {
					possible++;
				}
			}

			if (possible > 1) ㅣ++;
		}

		sb.append(ㅣ);

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

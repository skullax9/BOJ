import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		StringBuilder sb = new StringBuilder();

		String alpha = "abcdefghijklmnopqrstuvwxyz";

		sb.append(" ").append(alpha.toUpperCase()).append(alpha);

		String[] total = sb.toString().split("");

		sb.setLength(0);

		int N = fr.nextInt();

		String[] inputs = new String[N];

		for (int i = 0; i < N; i++) {
			inputs[i] = total[fr.nextInt()];
		}

		String[] sp = fr.nextLine().split("");

		Arrays.sort(inputs);
		Arrays.sort(sp);

		sb.append(Arrays.equals(inputs, sp) ? "y" : "n");

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

import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.Collectors;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		StringBuilder sb = new StringBuilder();

		String alpha = "abcdefghijklmnopqrstuvwxyz";
		int[] def = new int[alpha.length()];

		while (true) {
			String str = fr.nextLine();

			if (str.equals("*")) break;

			List<Integer> list = new ArrayList<>();

			for (int i = 0; i < alpha.length(); i++) {
				list.add(0);
			}

			String[] sp = str.split("");

			for (String s : sp) {
				if (s.isBlank()) continue;

				int index = alpha.indexOf(s);

				list.set(index, list.get(index) + 1);
			}

			long cnt = list.stream().filter(f -> f == 0).count();

			sb.append(cnt == 0 ? "Y" : "N").append("\n");
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

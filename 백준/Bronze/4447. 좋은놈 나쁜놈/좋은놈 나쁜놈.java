import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		StringBuilder sb = new StringBuilder();

		List<String> list = new ArrayList<>();

		int n = fr.nextInt();

		for (int i = 0; i < n; i++) {
			list.add(fr.nextLine());

			sb.append(list.get(i)).append(" is ");

			List<String> split = new ArrayList<>(List.of(list.get(i).split("")));

			long gCount = split.stream().filter(f -> f.equalsIgnoreCase("g")).count();
			long bCount = split.stream().filter(f -> f.equalsIgnoreCase("b")).count();

			if (gCount == bCount) sb.append("NEUTRAL");
			if (bCount > gCount) sb.append("A BADDY");
			if (bCount < gCount) sb.append("GOOD");

			sb.append("\n");
		}

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

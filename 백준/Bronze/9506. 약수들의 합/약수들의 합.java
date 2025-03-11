import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		StringBuilder sb = new StringBuilder();

		while (true) {
			int num = fr.nextInt();

			if (num == -1) {
				System.out.println(sb);
				break;
			}

			sb.append(num);

			List<Integer> list = new ArrayList<>();
			int sum = 0;

			for (int i = 1; i <= num / 2; i++) {
				if (num % i == 0) {
					list.add(i);
					sum += i;
				}
			}

			if (num == sum) {
				sb.append(" = ");
				for (int i = 0; i < list.size() - 1; i++) {
					sb.append(list.get(i)).append(" + ");
				}
				sb.append(list.get(list.size() - 1)).append("\n");
			} else {
				sb.append(" is NOT perfect.").append("\n");
			}
		}
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

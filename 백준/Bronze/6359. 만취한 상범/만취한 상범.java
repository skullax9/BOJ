import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		StringBuilder sb = new StringBuilder();

		int T = fr.nextInt();
		// 1 열림 0 닫힘
		for (int i = 0; i < T; i++) {
			int[] arr = new int[fr.nextInt()];

			Arrays.fill(arr, 1);

			List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

			for (int j = 1; j < arr.length; j++) {
				for (int k = 0; k < arr.length; k++) {
					if ((k + 1) % (j + 1) == 0) {
						list.set(k, list.get(k) == 0 ? 1 : 0);
					}
				}
			}
			sb.append(list.stream().filter(f -> f.equals(1)).count()).append("\n");
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

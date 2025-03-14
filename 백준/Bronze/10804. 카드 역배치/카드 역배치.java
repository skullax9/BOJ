import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		List<Integer> list = IntStream.rangeClosed(1, 20).boxed().collect(Collectors.toList());

		for (int i = 0; i < 10; i++) {
			int a = fr.nextInt();
			int b = fr.nextInt();

			List<Integer> subList = new ArrayList<>(list.subList(a - 1, b));

			for (int j = 1; j <= b - a + 1; j++) {
				list.set((a + j) - 2, subList.get(subList.size() - j));
			}
		}

		System.out.println(list.stream().map(String::valueOf).collect(Collectors.joining(" ")));
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

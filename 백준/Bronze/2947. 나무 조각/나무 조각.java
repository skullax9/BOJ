import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		List<Integer> list = new ArrayList<>();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 5; i++) {
			list.add(fr.nextInt());
		}

		while (true) {
			swap(list, 0, 1, sb);
			swap(list, 1, 2, sb);
			swap(list, 2, 3, sb);
			swap(list, 3, 4, sb);

			String word = list.stream().map(String::valueOf).collect(Collectors.joining(" "));

			if (word.equals("1 2 3 4 5")) break;
		}

		System.out.println(sb);
	}

	static void swap(List<Integer> list, int idx, int target, StringBuilder sb) {
		if (list.get(idx) > list.get(target)) {
			int mid = list.get(idx);
			list.set(idx, list.get(target));
			list.set(target, mid);

			String word = list.stream().map(String::valueOf).collect(Collectors.joining(" "));

			sb.append(word).append("\n");
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

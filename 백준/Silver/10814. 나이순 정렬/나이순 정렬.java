import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		int N = fr.nextInt();

		Map<Integer, List<String>> map = new HashMap<>();

		for (int i = 0; i < N; i++) {
			String[] arr = fr.nextLine().split(" ");

			int age = Integer.parseInt(arr[0]);

			List<String> name = map.containsKey(age) ? new ArrayList<>(map.get(age)) : new ArrayList<>();

			name.add(arr[1]);

			map.put(age, name);
		}

		StringBuilder sb = new StringBuilder();

		for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
			final int size = entry.getValue().size();

			var sr = entry.getValue();

			for (int i = 0; i < size; i++) {
				sb.append(entry.getKey()).append(" ").append(sr.get(i)).append("\n");
			}
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

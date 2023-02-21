import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		StringBuilder sb = new StringBuilder();

		int N = fr.nextInt();

		Map<String, Integer> map = new HashMap<>();

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < N; i++) {
			String animal = fr.nextLine();

			if (map.containsKey(animal)) {
				int replace = map.get(animal) + 1;

				map.replace(animal, replace);

				max = Math.max(max, replace);
			} else {
				max = Math.max(max, 1);

				map.put(animal, 1);
			}
		}

		int finalMax = max;

		String animal = map.entrySet().stream().filter(f -> f.getValue() == finalMax).collect(Collectors.toList()).get(0).getKey();

		sb.append(animal).append(" ").append(max);

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

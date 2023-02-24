import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		StringBuilder sb = new StringBuilder();

		int N = fr.nextInt();
		int C = fr.nextInt();

		HashMap<Integer, Integer> hashMap = new LinkedHashMap<>();

		for (int i = 0; i < N; i++) {
			int num = fr.nextInt();

			if (hashMap.containsKey(num)) {
				hashMap.replace(num, hashMap.get(num) + 1);
			} else {
				hashMap.put(num, 1);
			}
		}

		SortedMap<Integer, List<Integer>> map = new TreeMap<>(Collections.reverseOrder());

		for (int i : hashMap.keySet()) {
			int size = hashMap.get(i);

			if (map.containsKey(size)) {
				List<Integer> list = new ArrayList<>(map.get(size));

				list.add(i);

				map.replace(size, list);
			} else {
				map.put(size, Collections.singletonList(i));
			}
		}

		for (int i : map.keySet()) {
			for (int j : map.get(i)) {
				String str = j + " ";

				sb.append(str.repeat(i));
			}
		}

		System.out.println(sb);
	}

	private static String str(char c) {
		return String.valueOf(c);
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

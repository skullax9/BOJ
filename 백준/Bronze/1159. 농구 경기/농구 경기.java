import java.io.*;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		StringBuilder sb = new StringBuilder();

		int N = fr.nextInt();

		SortedSet<Character> set = new TreeSet<>();
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < N; i++) {
			char c = fr.nextLine().charAt(0);

			if (map.containsKey(c)) {
				int replace = map.get(c) + 1;

				map.replace(c, replace);

				if (replace >= 5) set.add(c);
			} else {
				map.put(c, 1);
			}
		}

		if (set.isEmpty()) {
			System.out.println("PREDAJA");
		} else {
			for (char c : set) {
				sb.append(c);
			}

			System.out.println(sb);
		}
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

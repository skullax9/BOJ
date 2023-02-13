import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		String N = fr.nextLine();
		String[] sp = N.split("");

		int sum = Arrays.stream(sp).mapToInt(Integer::parseInt).sum();

		Map<String, Integer> map = new HashMap<>();

		StringBuilder sb = new StringBuilder();

		if (sum % 3 != 0 || !N.contains("0")) {
			System.out.println(-1);
		} else {
			for (String s : sp) {
				if (map.containsKey(s)) {
					map.replace(s, map.get(s) + 1);
				} else {
					map.put(s, 1);
				}
			}

			for (int i = 9; i >= 0; i--) {
				int repeat = map.get(toStr(i)) == null ? 0 : map.get(toStr(i));
				sb.append(toStr(i).repeat(repeat));
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

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		StringBuilder sb = new StringBuilder();

		final String[] card = {"P", "K", "H", "T"};

		String S = fr.nextLine();

		int len = S.length();

		List<String> cardList = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();
		boolean isGreska = false;

		for (int i = 0; i <= len - 3; i += 3) {
			String str = S.substring(i, i + 3);

			if (cardList.contains(str)) {
				isGreska = true;
				break;
			}

			cardList.add(str);

			String[] sp = str.split("");

			String type = sp[0];

			if (map.containsKey(type)) {
				map.replace(type, map.get(type) + 1);
			} else {
				map.put(type, 1);
			}
		}

		if (isGreska) {
			System.out.println("GRESKA");
		} else {
			for (String type : card) {
				if (map.containsKey(type)) {
					sb.append(13 - map.get(type)).append(" ");
				} else {
					sb.append(13).append(" ");
				}
			}
		}

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

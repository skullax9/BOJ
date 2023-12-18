import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		String str = fr.nextLine().toUpperCase();

		List<String> list = Arrays.asList(str.split(""));

		Map<String, List<String>> map = list.stream().collect(Collectors.groupingBy(String::toString));
		Map<Integer, String> realMap = new HashMap<>();
		int idx = 0;
		int[] arr = new int[map.size()];

		for (String s : map.keySet()) {
			arr[idx++] = map.get(s).size();

			realMap.put(map.get(s).size(), s);
		}

		Arrays.sort(arr);

		if (arr.length > 1 && arr[arr.length - 1] == arr[arr.length - 2]) {
			System.out.println("?");
		} else {
			System.out.println(realMap.get(arr[arr.length - 1]));
		}
	}

	public static int parse(String s) {
		return Integer.parseInt(s);
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

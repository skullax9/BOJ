import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		StringBuilder sb = new StringBuilder();

		String[] s = fr.nextLine().split(" ");

		List<Integer> list = new ArrayList<>();

		for (String i : s) {
			list.add(Integer.parseInt(i));
		}

		if (list.size() == 1) System.out.println("Good");
		else {
			List<Integer> sumList = IntStream.range(1, list.size())
				.mapToObj(f -> list.get(f) - list.get(f - 1))
				.collect(Collectors.toList());

			long minus = sumList.stream().filter(f -> f < 0).count();
			long zero = sumList.stream().filter(f -> f == 0).count();

			if (list.size() - 1 == zero) {
				System.out.println("Bad");
			} else {
				System.out.println(minus > 0 ? "Bad" : "Good");
			}
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

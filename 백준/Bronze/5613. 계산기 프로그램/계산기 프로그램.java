import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		StringBuilder sb = new StringBuilder();

		String number = "0123456789";

		List<String> list = new ArrayList<>();

		while (true) {
			String s = fr.nextLine();

			if (s.equalsIgnoreCase("=")) break;

			list.add(s);

			if (list.size() == 3) {
				long sum = 0;
				switch (list.get(1)) {
					case "+" : sum = Long.parseLong(list.get(0)) + Long.parseLong(list.get(2));  break;
					case "-" : sum = Long.parseLong(list.get(0)) - Long.parseLong(list.get(2));  break;
					case "*" : sum = Long.parseLong(list.get(0)) * Long.parseLong(list.get(2));  break;
					case "/" : sum = Long.parseLong(list.get(0)) / Long.parseLong(list.get(2));  break;
				}

				list.clear();
				list.add(String.valueOf(sum));
			}
		}

		System.out.println(list.get(0));
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

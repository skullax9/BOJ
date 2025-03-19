import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		StringBuilder sb = new StringBuilder();

		Set<String> set = new HashSet<>();

		int N = fr.nextInt();
		final String dancer = "ChongChong";

		for (int i = 0; i < N; i++) {
			String meeting = fr.nextLine();

			if (meeting.contains(dancer)) {
				meeting = meeting.replace(dancer, "").replace(" ", "");
				set.add(dancer);
				set.add(meeting);
			} else {
				String[] split = meeting.split(" ");

				final boolean contains = set.contains(split[1]);

				if (set.contains(split[0])) set.add(split[1]);
				if (contains) set.add(split[0]);
			}
		}

		System.out.println(set.size());
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

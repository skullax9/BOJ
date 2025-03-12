import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		for (int i = 0; i < 3; i++) {
			List<Integer> list = new ArrayList<>();

			list.add(fr.nextInt());
			list.add(fr.nextInt());
			list.add(fr.nextInt());
			list.add(fr.nextInt());

			int cnt = (int) list.stream().filter(f -> f == 0).count();

			switch (cnt) {
				case 0 :
					System.out.println("E"); break;
				case 1 :
					System.out.println("A"); break;
				case 2 :
					System.out.println("B"); break;
				case 3 :
					System.out.println("C"); break;
				case 4 :
					System.out.println("D"); break;
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

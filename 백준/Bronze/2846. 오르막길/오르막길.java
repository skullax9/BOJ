import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		int N = fr.nextInt();
		List<Integer> list = new ArrayList<>();

		int ans = 0;
		int middle = 0;
		int start = -1;

		for (int i = 0; i < N; i++) {
			list.add(fr.nextInt());
		}

		for (int i = 1; i < list.size(); i++) {
			// 시작 구간
			if (list.get(i - 1) >= list.get(i)) {
				start = list.get(i);
				if (middle != 0) {
					ans = Math.max(ans, middle);
					middle = 0;
				}
			} else { // 종료구간 찾기
				if (start != -1) {
					ans = Math.max(ans, list.get(i) - start);

					if (i + 1 < list.size() && list.get(i) >= list.get(i + 1)) start = -1;
				} else {
					start = list.get(i - 1);
					middle = list.get(i) - start;
				}
			}
		}

		System.out.println(ans);
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

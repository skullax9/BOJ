import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
import java.util.concurrent.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		int K = fr.nextInt();

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= K; i++) {
			sb.append("Class ").append(i).append("\n");
			TreeSet<Integer> treeSet = new TreeSet<>();

			int classNum = fr.nextInt();

			for (int j = 0; j < classNum; j++) {
				treeSet.add(fr.nextInt());
			}

			sb.append("Max ").append(treeSet.last()).append(", Min ").append(treeSet.first()).append(", Largest gap ");

			int gap = 0;

			List<Integer> list = new ArrayList<>(treeSet);

			for (int j = 0; j < list.size() - 1; j++) {
				gap = Math.min(gap, list.get(j) - list.get(j + 1));
			}

			sb.append(gap * -1).append("\n");
		}

		System.out.println(sb);

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

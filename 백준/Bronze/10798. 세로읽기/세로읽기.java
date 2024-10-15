import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		String[] a = fr.nextLine().split("");
		String[] b = fr.nextLine().split("");
		String[] c = fr.nextLine().split("");
		String[] d = fr.nextLine().split("");
		String[] e = fr.nextLine().split("");

		int maxIndex = Math.max(a.length - 1, b.length - 1);
		maxIndex = Math.max(maxIndex, c.length -1);
		maxIndex = Math.max(maxIndex, d.length -1);
		maxIndex = Math.max(maxIndex, e.length -1);

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i <= maxIndex; i++) {
			String aWord = a.length <= i ? "" : a[i];
			String bWord = b.length <= i ? "" : b[i];
			String cWord = c.length <= i ? "" : c[i];
			String dWord = d.length <= i ? "" : d[i];
			String eWord = e.length <= i ? "" : e[i];

			sb.append(aWord).append(bWord).append(cWord).append(dWord).append(eWord);
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

import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		StringBuilder sb = new StringBuilder();

		String sad = fr.nextLine();
		String happy = new String(sad);

		int sadScore = -1;
		int happyScore = -1;

		while (true) {
			if (!sad.contains(":-(")) break;
			else {
				sad = sad.replaceFirst(":-\\(", "가");
				if (sadScore == -1) {
					sadScore = 1;
				} else {
					sadScore++;
				}
			}
		}

		while (true) {
			if (!happy.contains(":-)")) break;
			else {
				happy = happy.replaceFirst(":-\\)", "가");
				if (happyScore == -1) {
					happyScore = 1;
				} else {
					happyScore++;
				}
			}
		}

		if (happyScore == -1 && sadScore == -1) {
			sb.append("none");
		} else if (happyScore == sadScore) {
			sb.append("unsure");
		} else if (happyScore > sadScore) {
			sb.append("happy");
		} else {
			sb.append("sad");
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

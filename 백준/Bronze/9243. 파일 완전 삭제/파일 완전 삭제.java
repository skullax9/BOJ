import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.Collectors;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		int N = fr.nextInt();

		String file = fr.nextLine();
		String paste = fr.nextLine();

		String[] fileBit = file.split("");
		String[] pasteBit = paste.split("");

		StringBuilder sb = new StringBuilder();

		if (N % 2 == 0) {
			sb.append(file.equals(paste) ? "Deletion succeeded" : "Deletion failed");
		} else {
			boolean isDiff = true;
			for (int i = 0; i < fileBit.length; i++) {
				if (fileBit[i].equals(pasteBit[i])) {
					isDiff = false;
					break;
				}
			}

			sb.append(isDiff ? "Deletion succeeded" : "Deletion failed");
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

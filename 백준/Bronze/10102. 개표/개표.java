import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		int V = fr.nextInt();
		
		List<String> list = new ArrayList<>(List.of(fr.nextLine().split("")));
		
		long aCount = list.stream().filter(f -> f.equals("A")).count();
		long bCount = list.stream().filter(f -> f.equals("B")).count();
		
		if (aCount > bCount) {
			System.out.println("A");
		} else if (bCount > aCount) {
			System.out.println("B");
		} else {
			System.out.println("Tie");
		}
	}

	public static String convert(String str) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'A') {
				sb.append("B");
			} else {
				sb.append("A");
			}
		}

		return sb.toString();
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

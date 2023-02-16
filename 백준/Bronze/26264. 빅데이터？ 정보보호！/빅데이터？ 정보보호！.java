import java.io.*;
import java.math.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		int N = fr.nextInt();

		String str = fr.nextLine().replaceAll("security","1").replaceAll("bigdata","2");

		List<String> list = new ArrayList<>(List.of(str.split("")));

		long sCnt = list.stream().filter(f -> f.equals("1")).count();
		long bCnt = list.stream().filter(f -> f.equals("2")).count();

		if (sCnt > bCnt) {
			System.out.println("security!");
		} else if (bCnt > sCnt) {
			System.out.println("bigdata?");
		} else {
			System.out.println("bigdata? security!");
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

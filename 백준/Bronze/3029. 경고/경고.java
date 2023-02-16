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

		int day = 86400;

		String[] one = fr.nextLine().split(":");
		String[] two = fr.nextLine().split(":");

		LocalTime lt = LocalTime.of(parse(one[0]),parse(one[1]),parse(one[2]));
		LocalTime lt2 = LocalTime.of(parse(two[0]),parse(two[1]),parse(two[2]));

		long st = Math.abs(ChronoUnit.SECONDS.between(lt, lt2));

		if (parse(one[0]) > parse(two[0])) {
			st = day - st;
		}

		int hour = (int) st / 3600;

		st %= 3600;

		int min = (int) st / 60;

		st %= 60;

		int sec = (int) st;

		LocalTime get = LocalTime.of(hour, min, sec);
		
		String ans = DateTimeFormatter.ofPattern("HH:mm:ss").format(get);
		
		ans = ans.equals("00:00:00") ? "24:00:00" : ans;

		System.out.println(ans);
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

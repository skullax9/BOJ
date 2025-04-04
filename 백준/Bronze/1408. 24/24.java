import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();


		String[] now = fr.nextLine().split(":");
		String[] start = fr.nextLine().split(":");

		int nowSec = Integer.parseInt(now[0]) * 3600;
		nowSec += Integer.parseInt(now[1]) * 60;
		nowSec += Integer.parseInt(now[2]);

		int startSec = Integer.parseInt(start[0]) * 3600;
		startSec += Integer.parseInt(start[1]) * 60;
		startSec += Integer.parseInt(start[2]);

		StringBuilder sb = new StringBuilder();

		if (nowSec > startSec) {
			int day = (24 * 3600) - (Math.max(startSec, nowSec) - Math.min(startSec, nowSec));

			sb.append(String.format("%02d", day / 3600)).append(":");
			day %= 3600;
			sb.append(String.format("%02d", day / 60)).append(":");
			day %= 60;
			sb.append(String.format("%02d", day));
		} else {
			int remainSec = Math.max(startSec, nowSec) - Math.min(startSec, nowSec);

			sb.append(String.format("%02d", remainSec / 3600)).append(":");
			remainSec %= 3600;
			sb.append(String.format("%02d", remainSec / 60)).append(":");
			remainSec %= 60;
			sb.append(String.format("%02d", remainSec));
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

import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		Deque<String> queue = new ArrayDeque<>();

		int N = fr.nextInt();

		for (int i = 0; i < N; i++) {
			String cmd = fr.nextLine();

			if (cmd.contains("push")) {
				queue.push(cmd.split(" ")[1]);
				continue;
			}

			if (cmd.contains("pop")) {
				String pop = queue.isEmpty() ? "-1" : queue.pollLast();
				System.out.println(pop);
				continue;
			}

			if (cmd.contains("size")) {
				System.out.println(queue.size());
				continue;
			}

			if (cmd.contains("empty")) {
				String empty = queue.isEmpty() ? "1" : "0";
				System.out.println(empty);
				continue;
			}

			if (cmd.contains("front")) {
				String front = queue.isEmpty() ? "-1" : queue.peekLast();
				System.out.println(front);
				continue;
			}

			if (cmd.contains("back")) {
				String back = queue.isEmpty() ? "-1" : queue.peekFirst();
				System.out.println(back);
			}
		}
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

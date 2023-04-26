import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		int A = fr.nextInt();
		int B = fr.nextInt();

		int sum = A + B;

		String[] arr = fr.nextLine().split(" ");

		Set<String> set = new HashSet<>(Arrays.asList(arr));

		arr = fr.nextLine().split(" ");
		
		for (int i = 0; i < arr.length; i++) {
			if (set.contains(arr[i])) {
				sum -= 2;
			}
		}

		System.out.println(sum);
	}

	public static int parse(String str) {
		return Integer.parseInt(str);
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

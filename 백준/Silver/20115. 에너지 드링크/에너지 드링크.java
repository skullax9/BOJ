import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		int N = fr.nextInt();

		double[] nums = new double[N];

		for (int i = 0; i < N; i++) {
			nums[i] = fr.nextDouble();
		}

		Arrays.sort(nums);

		Double max = nums[N - 1];

		for (int i = 0; i < N - 1; i++) {
			max += nums[i] / 2;
		}
		
		if (max - max.intValue() == 0) {
			System.out.println(max.intValue());
		} else {
			System.out.println(max);	
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

import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.Collectors;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		String alpha = "abcdefghijklmnopqrstuvwxyz";

		StringBuilder sb = new StringBuilder();

		sb.append("0").append(alpha).append(alpha.toUpperCase());

		alpha = sb.toString();

		boolean[] arr = new boolean[1041];
		List<Integer> prime = new ArrayList<>();

		makePrime(arr , 1041);

		prime.add(1);

		for (int i = 0; i < arr.length; i++) {
			if (!arr[i]) prime.add(i);
		}

		int sum = 0;

		String[] sp = fr.nextLine().split("");

		for (int i = 0; i < sp.length; i++) {
			sum += alpha.indexOf(sp[i]);
		}

		System.out.println(prime.contains(sum) ? "It is a prime word." : "It is not a prime word.");
	}

	public static void makePrime(boolean[] arr,int N) {
		if (N < 2) return;

		arr[0] = arr[1] = true;

		for (int i = 2; i <= Math.sqrt(N); i++) {
			if (arr[i]) continue;

			for (int j = i * i; j < arr.length; j = j + i) {
				arr[j] = true;
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

import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		StringBuilder sb = new StringBuilder();

		String alpha = "abcdefghijklmnopqrstuvwxyz";

		String[] ans = {"Not a pangram", "Pangram!", "Double pangram!!", "Triple pangram!!!"};

		int[] count = new int[alpha.length()];

		Arrays.fill(count, 0);

		int n = fr.nextInt();

		for (int i = 0; i < n; i++) {
			List<Integer> list = Arrays.stream(count).boxed().collect(Collectors.toList());
			
			sb.append("Case ").append(i+1).append(": ");

			String str = fr.nextLine().toLowerCase();

			for (int j = 0; j < str.length(); j++) {
				if (Character.isAlphabetic(str.charAt(j))) {
					int index = alpha.indexOf(String.valueOf(str.charAt(j)));

					list.set(index, list.get(index) + 1);
				}
			}

			int min = list.stream().min(Integer::compareTo).get();

			sb.append(ans[min]).append("\n");
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

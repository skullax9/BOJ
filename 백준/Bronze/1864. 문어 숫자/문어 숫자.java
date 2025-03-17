import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		StringBuilder sb = new StringBuilder();

		Map<Character, Integer> map = new HashMap<>();
		
		map.put('/', -1);
		map.put('-', 0);
		map.put('\\', 1);
		map.put('(', 2);
		map.put('@', 3);
		map.put('?', 4);
		map.put('>', 5);
		map.put('&', 6);
		map.put('%', 7);
		
		while (true) {
			String word = fr.nextLine();
			
			if (word.equals("#")) break;

			int sum = 0;

			for (int i = 0; i < word.length(); i++) {
				sum += (int) (map.get(word.charAt(i)) * Math.pow(8, word.length() - 1 - i));
			}

			sb.append(sum).append("\n");
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

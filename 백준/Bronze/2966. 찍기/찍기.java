import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		List<Integer> list = new ArrayList<>();

		String aAnswer = "ABC".repeat(33) + "ABC";
		String bAnswer = "BABC".repeat(25);
		String cAnswer = "CCAABB".repeat(16) + "CCAA";

		StringBuilder sb = new StringBuilder();

		int N = fr.nextInt();
		String answer = fr.nextLine();

		int max = -1;
		int adrian = 0;
		int bruno = 0;
		int goran = 0;

		for (int i = 0; i < answer.length(); i++) {
			if (answer.charAt(i) == aAnswer.charAt(i)) {
				adrian++;
			}
			if (answer.charAt(i) == bAnswer.charAt(i)) {
				bruno++;
			}
			if (answer.charAt(i) == cAnswer.charAt(i)) {
				goran++;
			}
			max = Math.max(max, Math.max(adrian, Math.max(bruno, goran)));
		}

		sb.append(max).append("\n");

		if (max == adrian) {
			sb.append("Adrian").append("\n");
		}

		if (max == bruno) {
			sb.append("Bruno").append("\n");
		}

		if (max == goran) {
			sb.append("Goran").append("\n");
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

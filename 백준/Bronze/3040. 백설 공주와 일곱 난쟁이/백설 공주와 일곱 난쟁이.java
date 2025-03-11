import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		List<Integer> list = new ArrayList<>();

		for (int j = 0; j < 9; j++) {
			list.add(fr.nextInt());
		}

		findCombinations(list).get(0).stream().forEach(System.out::println);
	}

	private static List<List<Integer>> findCombinations(List<Integer> arr) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> data = new ArrayList<>();
		combinationUtil(arr, data, 0, arr.size() - 1, 0, result);
		return result;
	}

	private static void combinationUtil(List<Integer> arr, List<Integer> data, int start, int end, int index, List<List<Integer>> result) {
		if (index == 7) {
			int sum = 0;
			for (int val : data) {
				sum += val;
			}
			if (sum == 100) {
				result.add(new ArrayList<>(data)); // data의 복사본을 result에 추가
			}
			return;
		}

		for (int i = start; i <= end && end - i + 1 >= 7 - index; i++) {
			data.add(arr.get(i));
			combinationUtil(arr, data, i + 1, end, index + 1, result);
			data.remove(data.size() - 1); // 백트래킹
		}
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

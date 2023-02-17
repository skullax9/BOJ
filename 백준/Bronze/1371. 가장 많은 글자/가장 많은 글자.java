import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.Collectors;

class Main {
	public static void main(String[] args) throws IOException {
		FastReader fr = new FastReader();

		StringBuilder sb = new StringBuilder();

        String str;
        
		while ((str = fr.nextLine()) != null) {
			sb.append(str.replaceAll(" ",""));
		}

		List<String> list = new ArrayList<>(List.of(sb.toString().split("")));

		Map<String, List<String>> map = list.stream().collect(Collectors.groupingBy(String::toString));
		Map<Integer, List<String>> intMap = new HashMap<>();
		SortedSet<Integer> set = new TreeSet<>();

		for (String key : map.keySet()) {
			int sizeKey = map.get(key).size();

			set.add(sizeKey);

			if (intMap.containsKey(sizeKey)) {
				List<String> value = new ArrayList<>(intMap.get(sizeKey));
				
				value.addAll(map.get(key));
				
				intMap.replace(sizeKey, value);
			} else {
				intMap.put(sizeKey, map.get(key));	
			}
		}

		sb.setLength(0);

		list = intMap.get(set.last()).stream().sorted().distinct().collect(Collectors.toList());

		for (String s : list) {
			sb.append(s);
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

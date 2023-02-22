import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        List<Integer> scores = new ArrayList<>();

		scores.add(Integer.MIN_VALUE);
		scores.add(Integer.MIN_VALUE);
		scores.add(Integer.MIN_VALUE);

		String[] split = dartResult.split("");
        
		final String pows = "~SDT";

		for (int i = 1; i < split.length; i++) {
			int pow = pows.indexOf(split[i]);

			int index = (int) scores.stream().filter(f -> f != Integer.MIN_VALUE).count();

			if (index - 1 < 0) index = 0;

			if (pow != -1) {
				int num = parse(split[i - 1]);

				if (num == 0 && (i-2) >= 0 && split[i - 2].equals("1")) {
					num = 10;
				}

				scores.set(index, (int) Math.pow(num, pow));
			}
			
			if (split[i].equals("*")) {
				if (index >= 2) {
					scores.set(index - 2 , scores.get(index - 2) * 2);
				} 
                scores.set(index - 1, scores.get(index - 1) * 2);
			}

			if (split[i].equals("#")) {
				scores.set(index - 1, scores.get(index - 1) * -1);
			}
		}

		for (int i : scores) {
			answer += i;
		}
        
        return answer;
    }
    
    public static int parse(String str) {
		return Integer.parseInt(str);
	}
}
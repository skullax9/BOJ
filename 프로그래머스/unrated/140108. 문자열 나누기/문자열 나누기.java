class Solution {
    public int solution(String s) {
        int answer = 0;
		int xCount = 1;
		int sCount = 0;

		String[] split = s.split("");

		String std = split[0];

		for (int i = 1; i < split.length; i++) {
			if (xCount == sCount) {
				int len = xCount + sCount;

				s = s.replaceFirst(s.substring(0, len), "");

				answer++;

				xCount = 1;
				sCount = 0;
				std = split[i];

				continue;
			}

			xCount += std.equals(split[i]) ? 1 : 0;
			sCount += !std.equals(split[i]) ? 1 : 0;
		}

		if (s.length() > 0) answer++;
        
        return answer;
    }
}
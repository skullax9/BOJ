class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] joka = {"aya", "ye", "woo", "ma"};
        
        for (int i = 0; i < babbling.length; i++) {
			String word = babbling[i];

			for (int j = joka.length - 1; j >= 0; j--) {
				if (word.contains(joka[j])) {
					word = word.replaceAll(joka[j]," ");
				}
			}
			if (word.isBlank()) answer++;
		}
        
        return answer;
    }
}
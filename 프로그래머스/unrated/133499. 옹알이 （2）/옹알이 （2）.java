class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] pron = {"aya", "ye", "woo", "ma"};
        String relation = "ayayewooma";
        
        for (int i = 0; i < babbling.length; i++) {
            String word = babbling[i];
            
            for (int j = pron.length - 1; j >= 0; j--) {
                if (word.contains(pron[j])) {
                    word = word.replace(pron[j], relation.indexOf(pron[j]) + "");
                }
            }
            
            answer += getCount(word);
        }
        
        return answer;
    }
    
    public static int getCount(String word) {
        int score = 0;
        
        try {
            int nums = Integer.parseInt(word);
            
            String val = String.valueOf(word.charAt(0));
            
            String[] split = word.split("");
            
            boolean isSame = false;
            
            for (int i = 1; i < split.length; i++) {
                if (val.equals(split[i])) {
                    isSame = true;
                    break;
                } else {
                    val = split[i];
                }
            }
            
            score = isSame ? 0 : 1;
            
        } catch (Exception e) {
            return 0;
        }
        
        return score;
    }
}
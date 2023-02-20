import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        List<String> wordList = new ArrayList<>();
        
        wordList.add(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            String before = wordList.get(i - 1);
            String now = words[i];
            
            boolean contains = wordList.contains(now);
            boolean notCorrect = before.charAt(before.length() - 1) != now.charAt(0);
            
            if (contains || notCorrect) {
                int num = (i + 1) % n;
                
                num = num == 0 ? n : num;
                
                int count = (i / n) + 1;
                
                answer[0] = num;
                answer[1] = count;
                
                break;
            } else {
                wordList.add(now);
            }
        }

        return answer;
    }
}
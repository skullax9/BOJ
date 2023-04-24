import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < myStr.length(); i++) {
            char c = myStr.charAt(i);
            
            if (c != 'a' && c != 'b' && c != 'c') {
                sb.append(c);
            } else {
                answer.add(sb.toString());
                sb.setLength(0);
            }
        }
        
        answer.add(sb.toString());
        
        String[] ans = answer.stream().filter(f -> !f.isEmpty()).map(String::toString).toArray(String[]::new);
        
        return ans.length > 0 ? ans : new String[]{"EMPTY"};
    }
}
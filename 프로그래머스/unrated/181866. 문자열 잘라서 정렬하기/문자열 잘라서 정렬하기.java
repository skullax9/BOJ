import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        
        answer = Arrays.stream(answer).filter(f -> !f.contains("x") && f.length() > 0).toArray(String[]::new);
        
        Arrays.sort(answer);
        
        return answer;
    }
}
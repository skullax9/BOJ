import java.util.*;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < myString.length(); i++) {
            int idx = myString.indexOf(pat, i);
            
            if (idx != -1) {
                set.add(idx);
            }
        
        }
        
        return set.size();
    }
}
import java.util.stream.*;
import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        List<String> list = Arrays.asList(strArr);
        final int len = list.stream().map(f -> f.length()).max(Comparator.naturalOrder()).get();
        long answer = 0;
        
        for (int i = 1; i <= len; i++) {
            final int strLen = i;
            long len2 = list.stream().filter(f -> f.length() == strLen).count();
            
            answer = Math.max(len2, answer);
        }
        
        return (int) answer;
    }
}
import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < intStrs.length; i++) {
            int parse = parse(intStrs[i].substring(s, s + l));
            
            if (parse > k) {
                list.add(parse);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public int parse(String s) {
        return Integer.parseInt(s);
    }
} 
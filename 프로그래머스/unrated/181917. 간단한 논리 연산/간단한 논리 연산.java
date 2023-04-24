import java.util.*;

class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        Map<String, Boolean> first = new HashMap<>();
        
        first.put("00", true);
        first.put("01", true);
        first.put("10", true);
        first.put("11", false);
        
        Map<String, Boolean> second = new HashMap<>();
        
        second.put("00", true);
        second.put("01", false);
        second.put("10", false);
        second.put("11", false);
        
        StringBuilder str = new StringBuilder();
        
        str.append(x1 ? "0" : "1").append(x2 ? "0" : "1");
        
        boolean answer = first.get(str.toString());
        
        str = new StringBuilder();
        
        str.append(x3 ? "0" : "1").append(x4 ? "0" : "1");
        
        StringBuilder str2 = new StringBuilder();
        
        str2.append(answer ? "0" : "1").append(first.get(str.toString()) ? "0" : "1");
        
        return second.get(str2.toString());
    }
}
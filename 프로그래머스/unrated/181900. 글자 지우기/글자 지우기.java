import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        
        List<String> list = Arrays.asList(my_string.split(""));
        
        for (int i : indices) {
            list.set(i, "");
        }
        
        for (String s : list) {
            sb.append(s);
        }
        
        return sb.toString();
    }
}
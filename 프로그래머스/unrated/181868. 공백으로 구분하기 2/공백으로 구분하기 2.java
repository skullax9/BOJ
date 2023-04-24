import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        
        String[] arr = my_string.trim().split(" ");
        
        for (String s : arr) {
            if (s.length() > 0) list.add(s);
        }
        
        return list.toArray(new String[list.size()]);
    }
}
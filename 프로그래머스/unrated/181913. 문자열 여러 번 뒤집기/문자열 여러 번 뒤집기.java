import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder();
        String[] arr = my_string.split("");
        
        for (int[] i : queries) {
            for (int j = i[0]; j <= i[1]; j++) {
                sb.append(arr[j]);
                
                arr[j] = "";
            }
            
            String[] src = sb.reverse().toString().split("");
            
            for (int j = i[0]; j <= i[1]; j++) {
                arr[j] = src[j - i[0]];   
            }
            
            sb.setLength(0);
        }
        
            for (String s : arr) {
                sb.append(s);
            }
        
        return sb.toString();
    }
}
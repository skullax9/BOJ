import java.util.stream.*;
import java.util.*;

class Solution {
    public int solution(int[] arr, int idx) {
        StringBuilder sb = new StringBuilder();
        
        for (int i : arr) {
            sb.append(i);
        }
        
        return sb.toString().indexOf("1", idx);
    }
}
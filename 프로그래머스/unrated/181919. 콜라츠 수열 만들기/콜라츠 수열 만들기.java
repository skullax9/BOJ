import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        list.add(n);
        
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
                list.add(n);
            } else {
                n = (n * 3) + 1;
                list.add(n);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
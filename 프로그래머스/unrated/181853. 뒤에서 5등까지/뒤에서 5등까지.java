import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        
        return Arrays.copyOfRange(num_list, 0, 5);
    }
}
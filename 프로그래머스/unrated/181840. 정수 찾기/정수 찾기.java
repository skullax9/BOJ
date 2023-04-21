import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] num_list, int n) {
        long cnt = Arrays.stream(num_list).filter(f -> f == n).count();
        
        return cnt > 0 ? 1 : 0;
    }
}
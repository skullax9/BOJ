import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] num_list) {
        int sum = (int) Math.pow(IntStream.of(num_list).sum(), 2);
        int multiple = 1;
        
        for (int i : num_list) {
            multiple *= i;
        }
        
        return multiple > sum ? 0 : 1;
    }
}
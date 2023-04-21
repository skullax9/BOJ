import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String num_str) {
        int[] arr = Arrays.stream(num_str.split("")).mapToInt(Integer::parseInt).toArray();
        
        return IntStream.of(arr).sum();
    }
}
import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] between = IntStream.rangeClosed(l, r).toArray();
        
        List<Integer> list = Arrays.stream(between).boxed().collect(Collectors.toList());
        
        int[] answer = list.stream().filter(f -> String.valueOf(f).replaceAll("[0, 5]", "").length() ==0).mapToInt(Integer::intValue).toArray();
        
        return answer.length > 0 ? answer : new int[]{-1};
    }
}
import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        
        for (int i : delete_list) {
            list.removeIf(f -> f == i);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
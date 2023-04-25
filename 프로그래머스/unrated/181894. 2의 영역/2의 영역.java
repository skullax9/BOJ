import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        
        int firstIdx = list.indexOf(2);
        int lastIdx = list.lastIndexOf(2);
        
        if (firstIdx == lastIdx) {
            return lastIdx == -1 ? new int[]{-1} : new int[]{2};
        } else {
            return list.subList(firstIdx, lastIdx + 1).stream().mapToInt(Integer::intValue).toArray();
        }
    }
}
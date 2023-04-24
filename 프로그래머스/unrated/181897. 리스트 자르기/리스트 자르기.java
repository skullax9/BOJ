import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        
        List<Integer> answer = new ArrayList<>();
        
        if (n == 1) {
            return list.subList(0, slicer[1] + 1).stream().mapToInt(Integer::intValue).toArray();
        } else if (n == 2) {
            return list.subList(slicer[0], list.size()).stream().mapToInt(Integer::intValue).toArray();
        } else if (n == 3) {
            return list.subList(slicer[0], slicer[1] + 1).stream().mapToInt(Integer::intValue).toArray();
        } else {
            for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
                answer.add(num_list[i]);
            }
            
            return answer.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}
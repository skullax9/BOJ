import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for (int i = 0; i < answer.length; i++) {
            int[] copy = Arrays.copyOfRange(arr, queries[i][0], queries[i][1] + 1);
            
            final int std = queries[i][2];
            
            List<Integer> list = Arrays.stream(copy).filter(f -> f > std).boxed().sorted().collect(Collectors.toList());
            
            answer[i] = list.isEmpty() ? -1 : list.get(0);
        }
        
        return answer;
    }
}
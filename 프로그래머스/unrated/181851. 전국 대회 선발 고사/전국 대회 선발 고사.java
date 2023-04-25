import java.util.stream.*;
import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<Integer> ranks = Arrays.stream(rank).boxed().collect(Collectors.toList());
        List<Integer> list = new ArrayList<>();
        
        for (int i = 1; i <= rank.length; i++) {
            int index = ranks.indexOf(i);
            if (attendance[index]) list.add(index);
        }
        
        int answer = (10000 * list.get(0)) + (100 * list.get(1)) + list.get(2);
        return answer;
    }
}
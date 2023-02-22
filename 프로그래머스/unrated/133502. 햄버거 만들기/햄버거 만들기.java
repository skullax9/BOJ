import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        List<Integer> list = Arrays.stream(ingredient).boxed().collect(Collectors.toList());
        
        if (ingredient.length < 4) return 0;
        
        for (int i = 3; i < list.size(); i++) {
            if (list.get(i) == 1 && i > 2) {
                if (list.get(i - 1) == 3 && list.get(i - 2) == 2 && list.get(i - 3) == 1) {
                    answer++;
                    
                    list.remove(i);
                    list.remove(i - 1);
                    list.remove(i - 2);
                    list.remove(i - 3);
                    
                    i -= 4;
                }
            }
        }
        
        return answer;
    }
}
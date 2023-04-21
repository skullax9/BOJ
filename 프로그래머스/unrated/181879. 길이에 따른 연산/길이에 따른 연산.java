import java.util.stream.*;

class Solution {
    public int solution(int[] num_list) {
        if (num_list.length > 10) {
            return IntStream.of(num_list).sum();
        }
        
        int answer = 1;
            
        for (int i : num_list) answer *= i;
        
        return answer;
    }
}
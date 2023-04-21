import java.util.stream.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if (n % 2 == 1) {
            answer = IntStream.rangeClosed(1, n).filter(f -> f % 2 == 1).sum();
        } else {
            answer = IntStream.rangeClosed(1, n).filter(f -> f % 2 == 0).map(f -> (int) Math.pow(f, 2)).sum();
        }
        
        return answer;
    }
}
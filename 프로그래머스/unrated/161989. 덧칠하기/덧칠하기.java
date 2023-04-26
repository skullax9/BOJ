import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        boolean[] painted = new boolean[n + 1];
        
        Arrays.fill(painted, true);
        
        for (int idx : section) {
            painted[idx] = false;
        }
        
        int answer = 0;
        
        if (n == m) return 1;
        
        for (int i = 1; i <= n; i++) {
            if (painted[i]) continue;
            
            int limit = Math.min(i + m, painted.length);
            
            for (int j = i; j < limit; j++) {
                painted[j] = true;
            }
            answer++;
        }
        
        return answer;
    }
}
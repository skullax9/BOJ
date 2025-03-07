import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        int width = bill[0];
        int length = bill[1];
        
        while (true) {
            boolean isFit = Math.min(wallet[0], wallet[1]) >= Math.min(width, length);
            isFit = isFit && Math.max(wallet[0], wallet[1]) >= Math.max(width, length);
            
            if (isFit) break;
            
            if (width > length) width /= 2;
            else length /= 2;
            
            answer++;
        }
        
        return answer;
    }
}
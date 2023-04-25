import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        while (true) {
            int cnt = 0;
            
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                    cnt++;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] *= 2;
                    arr[i]++;
                    cnt++;
                }
            }
            
            answer++;
            
            if (cnt == 0) {
                break;
            }
        }
        
        return answer - 1;
    }
}
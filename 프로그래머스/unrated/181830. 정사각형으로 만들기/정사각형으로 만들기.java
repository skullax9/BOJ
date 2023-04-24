import java.util.*;
import java.util.stream.*;

class Solution {
    public int[][] solution(int[][] arr) {
        int width = arr.length;
        int height = arr[0].length;
        
        if (width == height) return arr;
        
        int max = Math.max(width, height);
        int min = Math.min(width, height);
        
        int[][] answer = new int[max][max];
        
        if (height > width) {
            for (int i = 0; i < max; i++) {
                if (i >= width) {
                    Arrays.fill(answer[i], 0);
                } else {
                    answer[i] = arr[i];
                }
            }
        } else {
            for (int i = 0; i < max; i++) {
                for (int j = 0; j < min; j++) {
                    answer[i][j] = arr[i][j];
                }
            }
        }
        
        return answer;
    }
}
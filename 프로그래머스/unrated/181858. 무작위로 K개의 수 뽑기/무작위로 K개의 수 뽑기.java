import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        var answer = new ArrayList<Integer>();
        int[] realAnswer = new int[k];
        
        answer.add(arr[0]);
        
        for (int i = 1; i < arr.length; i++) {
            if (!answer.contains(arr[i])) {
                answer.add(arr[i]);
            }
        }
        
        if (answer.size() != k) {
            for (int i = 0; i < k; i++) {
                answer.add(-1);
            }
        }
        
        for (int i = 0; i < k; i++) {
            realAnswer[i] = answer.get(i);
        }
    
        return realAnswer;
    }
}
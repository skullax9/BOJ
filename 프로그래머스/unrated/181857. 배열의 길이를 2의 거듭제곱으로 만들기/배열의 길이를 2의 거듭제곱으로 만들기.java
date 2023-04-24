import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        Double sqrt = Math.sqrt(arr.length);
        int intVal = sqrt.intValue();
        int len = arr.length;
        
        List<Integer> pow = new ArrayList<>();
        
        for (int i = 0; i <= 10; i++) {
            pow.add((int) Math.pow(2, i));
        }
        
        if (pow.contains(len)) {
            return arr;
        }
        

        for (int i = 1; i < pow.size(); i++) {
            if (len > pow.get(i - 1) && len < pow.get(i)) {
                int[] newArr = new int[pow.get(i)];
                    
                Arrays.fill(newArr, 0);
                    
                for (int j = 0; j < arr.length; j++) {
                    newArr[j] = arr[j];
                }
                    
                return newArr;
            }
        }
        
        return new int[0];
    }
}
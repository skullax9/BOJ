import java.util.*;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        if (arr1.length != arr2.length) {
            return arr1.length > arr2.length ? 1 : -1;
        } else {
            int one = Arrays.stream(arr1).boxed().mapToInt(Integer::intValue).sum();
            int two = Arrays.stream(arr2).boxed().mapToInt(Integer::intValue).sum();
            
            if (one == two) return 0;
            
            return one > two ? 1 : -1;   
        }
    }
}
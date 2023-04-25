import java.util.*;
import java.util.stream.*;

class Solution {
    public Stack<Integer> solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        
        int i = 0;
        
        while (true) {
            if (stk.isEmpty()) {
                stk.push(arr[i]);
                i++;
            } else {
                int peek = stk.peek();
                
                if (peek == arr[i]) {
                    stk.pop();
                    i++;
                } else {
                    stk.push(arr[i]);
                    i++;
                }
            }
            
            if (i >= arr.length) break;
        }
        
        if (stk.isEmpty()) {
            stk.push(-1);
        }
        
        return stk;
    }
}
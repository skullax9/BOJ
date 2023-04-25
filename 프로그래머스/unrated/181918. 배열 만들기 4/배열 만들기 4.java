import java.util.*;

class Solution {
    public Stack<Integer> solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        
        int i = 0;
        
        while (true) {
            if (stack.isEmpty()) {
                stack.push(arr[i]);
                i++;
            } else {
                if (stack.peek() < arr[i]) {
                    stack.push(arr[i]);
                    i++;
                } else {
                    stack.pop();
                }
            }
            
            if (i >= arr.length) break;
        }
        
        return stack;
    }
}
import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        
        for (int i : num_list) {
            if (i % 2 == 1) {
                odd.append(i);
            } else {
                even.append(i);
            }
        }
        
        return Integer.parseInt(odd.toString()) + Integer.parseInt(even.toString());
    }
}
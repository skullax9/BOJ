import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String myString) {
        int std = 0;
        String[] arr = myString.split("");
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("x")) {
                std++;
            } else {
                list.add(std);
                std = 0;
            }
        }
        
        list.add(std);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
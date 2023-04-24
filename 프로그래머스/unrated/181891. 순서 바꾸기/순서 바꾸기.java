import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();
        
        int[] first = Arrays.copyOfRange(num_list, 0, n);
        int[] second = Arrays.copyOfRange(num_list, n, num_list.length);
        
        for (int i : second) {
            list.add(i);
        }
        
        for (int i : first) {
            list.add(i);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
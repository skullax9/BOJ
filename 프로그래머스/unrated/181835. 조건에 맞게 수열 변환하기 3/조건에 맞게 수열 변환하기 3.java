import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        return k % 2 == 1 
            ? Arrays.stream(arr).map(f -> f * k).boxed().collect(Collectors.toList()).stream().mapToInt(Integer::intValue).toArray()
            :  Arrays.stream(arr).map(f -> f + k).boxed().collect(Collectors.toList()).stream().mapToInt(Integer::intValue).toArray();
    }
}
import java.util.stream.*;
import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        return IntStream.rangeClosed(1, n).filter(f -> f % k == 0).toArray();
    }
}
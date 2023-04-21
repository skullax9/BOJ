import java.util.stream.*;
import java.util.*;

class Solution {
    public int[] solution(int start, int end) {
        return IntStream.rangeClosed(end, start).boxed().collect(Collectors.toList()).stream().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
    }
}
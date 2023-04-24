import java.util.*;
import java.time.*;

class Solution {
    public int solution(int[] date1, int[] date2) {
        LocalDate first = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate second = LocalDate.of(date2[0], date2[1], date2[2]);
        
        return first.isBefore(second) ? 1 : 0;
    }
}
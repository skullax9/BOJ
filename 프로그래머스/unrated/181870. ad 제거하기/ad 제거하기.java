import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String[] strArr) {
        return Arrays.stream(strArr).filter(f -> !f.contains("ad")).toArray(String[]::new);
    }
}
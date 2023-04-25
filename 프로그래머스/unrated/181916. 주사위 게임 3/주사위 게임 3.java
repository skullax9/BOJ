import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        Map<Integer, Integer> map = new HashMap<>();
        SortedSet<Integer> set = new TreeSet<>();
        
        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);
        
        set.add(a);
        set.add(b);
        set.add(c);
        set.add(d);
        
        if (set.size() == 1) {
            return 1111 * set.first();
        } else if (set.size() == 2) {
            if (map.get(set.first()) > map.get(set.last())) {
                return (int) Math.pow(10 * set.first() + set.last(), 2);
            } else if (map.get(set.first()) < map.get(set.last())) {
                return (int) Math.pow(10 * set.last() + set.first(), 2);
            } else {
                return (set.first() + set.last()) * (set.last() - set.first());
            }
        } else if (set.size() == 3) {
            int answer = 1;
            for (int i : set) {
                if (map.get(i) == 1) {
                    answer *= i;
                }
            }
            return answer;
        } else {
            return set.first();
        }
        
    }
}
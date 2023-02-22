import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        
        var map = new HashMap<String, Integer>();
        
        for (int i = 0; i < survey.length; i++) {
            String[] type = survey[i].split("");
            
            int score = choices[i] - 4;
            
            if (score == 0) {
                map.putIfAbsent(type[0], 0);
                map.putIfAbsent(type[1], 0);
            } else {
                if (score > 0) {
                    if (map.containsKey(type[1])) {
                        int existScore = map.get(type[1]);
                        map.replace(type[1], existScore, existScore + score);
                    } else {
                        map.put(type[1], score);
                    }
                } else {
                    if (map.containsKey(type[0])) {
                        int existScore = map.get(type[0]);
                        map.replace(type[0], existScore, existScore + (score * -1));
                    } else {
                        map.put(type[0], (score * -1));
                    }
                }
            }
        }
        
        answer.append(getType(map, "RT"));
        answer.append(getType(map, "CF"));
        answer.append(getType(map, "JM"));
        answer.append(getType(map, "AN"));
        
        return answer.toString();
    }
    
    private String getType(Map<String, Integer> map, String types) {
        String[] arr = types.split("");
        
        int first = map.getOrDefault(arr[0], 0);
        int second = map.getOrDefault(arr[1], 0);
        
        if (first == second) {
            Arrays.sort(arr);
            return arr[0];
        }
        
        if (first > second) {
            return arr[0];
        } else {
            return arr[1];
        }
    }
}
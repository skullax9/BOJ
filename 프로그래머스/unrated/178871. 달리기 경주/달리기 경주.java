import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        Map<Integer, String> rankMap = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i + 1);
            rankMap.put(i + 1, players[i]);
        }
        
        for (int i = 0; i < callings.length; i++) {
            int rank = map.get(callings[i]);
            String front = rankMap.get(rank - 1);
            
            map.put(callings[i], rank - 1);
            map.put(front, rank);
            rankMap.put(rank, front);
            rankMap.put(rank - 1, callings[i]);
        }
        
        String[] answer = new String[players.length];
        
        int index = 0;
        
        for (Integer rank : rankMap.keySet()) {
            answer[index++] = rankMap.get(rank);
        }
        
        return answer;
    }
}
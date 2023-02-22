import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        int one = 0;
		int two = 0;
		
		Deque<String> deque = new ArrayDeque<>(List.of(goal));
		
		for (int i = 0; i < goal.length; i++) {
			String peek = deque.peekFirst();
			if (one < cards1.length && peek.equals(cards1[one])) {
				one++;
				deque.pollFirst();
			}
			if (two < cards2.length && peek.equals(cards2[two])) {
				two++;
				deque.pollFirst();
			}
		}
		
		if (!deque.isEmpty()) answer = "No";
        
        return answer;
    }
}
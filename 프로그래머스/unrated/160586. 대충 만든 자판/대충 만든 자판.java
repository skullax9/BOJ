import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        String join = String.join("", keymap);

		Set<String> set = new HashSet<>(List.of(join.split("")));

		Map<String, Integer> map = new HashMap<>();

		for (String value : keymap) {
			for (String s : set) {
				int index = value.indexOf(s) + 1;

				if (index == 0) continue;

				if (map.containsKey(s)) {
					map.replace(s, Math.min(map.get(s), index));
				} else {
					map.put(s, index);
				}
			}
		}

		for (int i = 0; i < targets.length; i++) {
			String[] sp = targets[i].split("");

			int sum = 0;

			for (String s : sp) {
			    if (!map.containsKey(s)) {
			        sum = -1;
			        break;
			    }
				sum += map.get(s);
			}
            
            answer[i] = sum;
		}
        
        return answer;
    }
}
import java.util.*;

class Solution {
    static int count = 0;
    static List<String> stringList = new ArrayList<>();
    public int[][] solution(int n) {
        move(n, 1, 3);
        
        int[][] answer = new int[count][2];
        
        for (int i = 0; i < count; i++) {
            String[] sp = stringList.get(i).split(" ");
            
            answer[i][0] = Integer.parseInt(sp[0]);
            answer[i][1] = Integer.parseInt(sp[1]);
        }
        
        return answer;
    }
    
    static void move(int no, int x, int y) {
		count++;

		if (no > 1) {
			move(no - 1, x, 6 - x - y);
		}

		stringList.add(x + " " + y);

		if (no > 1) {
			move(no - 1, 6 - x - y, y);
		}
	}
}
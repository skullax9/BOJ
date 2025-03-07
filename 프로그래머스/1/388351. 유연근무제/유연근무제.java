import java.time.*;

class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        for (int i = 0; i < schedules.length; i++) {
            boolean isSuccess = true;
            
            LocalTime cutLine = build(schedules[i], 10);

            for (int j = 0; j < timelogs[i].length; j++) {
                int std = j + startday;
                std = std > 7 ? std - 7 : std;
                if (std != 6 && std != 7) {
                    if (build(timelogs[i][j], 0).isAfter(cutLine)) {
                        isSuccess = false;
                        break;
                    }
                }
            }
            
            if (isSuccess) answer++;
        }
        
        return answer;
    }
    
    public static LocalTime build(int std, int plus) {
		String[] stdTime = String.valueOf(std).split("");

		int hour, min;

		if (stdTime.length == 3) {
			hour = Integer.parseInt(stdTime[0]);
			min = Integer.parseInt(String.format("%s%s", stdTime[1], stdTime[2]));
		} else {
			hour = Integer.parseInt(String.format("%s%s", stdTime[0], stdTime[1]));
			min = Integer.parseInt(String.format("%s%s", stdTime[2], stdTime[3]));
		}

		return LocalTime.of(hour, min).plusMinutes(plus);
	}
}
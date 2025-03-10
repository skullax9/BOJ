import java.time.*;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        
        String[] lenSplit = video_len.split(":");
        String[] posSplit = pos.split(":");
        String[] startSplit = op_start.split(":");
        String[] endSplit = op_end.split(":");
        
        LocalTime std = LocalTime.of(0, 0, 0);
        LocalTime duration = LocalTime.of(0,Integer.parseInt(lenSplit[0]), Integer.parseInt(lenSplit[1]));
        LocalTime now = LocalTime.of(0,Integer.parseInt(posSplit[0]), Integer.parseInt(posSplit[1]));
        LocalTime start = LocalTime.of(0,Integer.parseInt(startSplit[0]), Integer.parseInt(startSplit[1]));
        LocalTime end = LocalTime.of(0,Integer.parseInt(endSplit[0]), Integer.parseInt(endSplit[1]));
        
        if (now.isAfter(start) && now.isBefore(end)) now = end;
        
        for (String command : commands) {
            if (command.equals("next")) {
                if (now.plusSeconds(10).isAfter(duration)) {
                    now = duration;
                } else {
                    now = now.plusSeconds(10);        
                }
            } else {
                if (now.minusSeconds(10).getHour() != 0) {
                    now = std;
                } else {
                    now = now.minusSeconds(10);        
                }
            }
            if (now.equals(start) || now.isAfter(start) && now.isBefore(end)) now = end;
        }
        
        answer = String.format("%02d:%02d", now.getMinute(), now.getSecond());
        
        return answer;
    }
}
import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        Map<String, Integer> reportMap = new HashMap<>();
        Map<String, List<String>> userReportMap = new HashMap<>();
        
        for (int i = 0; i < id_list.length; i++) {
            reportMap.put(id_list[i], 0);
        }
        
        for (int i = 0; i < report.length; i++) {
            String[] users = report[i].split(" ");
            
            if (userReportMap.containsKey(users[0])) {          // 신고를 했었던 유저면서
                if (userReportMap.get(users[0]) != null) {      // 신고한 유저목록이 비어있지 않고
                    long count = userReportMap.get(users[0]).stream().filter(f -> f.equals(users[1])).count();
                    
                    if (count > 0) continue;                    // 신고한 유저목록에 이미 들어가있다면 패스한다.
                }
            }
            
            boolean isExist = userReportMap.get(users[0]) != null;
            
            List<String> list = isExist ? userReportMap.get(users[0]) : new ArrayList<>();
            
            list.add(users[1]);
            
            if (isExist) {
                userReportMap.replace(users[0], list);
            } else {
                userReportMap.put(users[0], list);
            }
            
            reportMap.put(users[1], reportMap.get(users[1]) + 1);
        }
        
        List<String> stopUsing = new ArrayList<>();
        
        for (String name : reportMap.keySet()) {
            boolean isReported = reportMap.get(name) >= k;
            
            if (!isReported) continue;
            
            stopUsing.add(name);
        }
        
        for (int i = 0; i < id_list.length; i++) {
            boolean isExist = userReportMap.get(id_list[i]) != null;
            
            int cnt = 0;
            
            if (isExist) {
                List<String> reportList = userReportMap.get(id_list[i]);
                for (int j = 0; j < stopUsing.size(); j++) {
                    final int idx = j;
                    cnt += (int) reportList.stream().filter(f -> f.equals(stopUsing.get(idx))).count();
                }
            }
            
            answer[i] = cnt;
        }
            
        return answer;
    }
}
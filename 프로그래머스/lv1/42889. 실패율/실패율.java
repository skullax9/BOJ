import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        double[] arrive = new double[N + 1];
        double[] clear = new double[N + 1];
        
        List<double[]> list = new ArrayList<>();
        
        for (int i = 0; i < stages.length; i++) {
            arrive[stages[i] - 1]++;
            for (int j = 0; j < stages[i]; j++) {
                clear[j]++;
            }
        }
        
        for (int i = 0; i < N; i++) {
            double percent = clear[i] == 0 ? 0 : arrive[i] / clear[i];
            
            list.add(new double[]{i, percent});
        }
        
        list.sort((stage, percent) -> Double.compare(percent[1], stage[1]));
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = (int) list.get(i)[0] + 1;
        }
        
        return answer;
    }
}
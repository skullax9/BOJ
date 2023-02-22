import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        List<Integer> bucket = new ArrayList<>();
        
        List<Integer[]> lineList = new ArrayList<>();
        
        for (int i = 0; i < board.length; i++) {
            lineList.add(getLine(board, i));
        }
        
        for (int i = 0; i < moves.length; i++) {
            int lineIdx = moves[i] - 1;
            Integer[] arr = lineList.get(lineIdx);
            int lastIndex = bucket.size() - 1;
            
            for (int j = arr.length - 1; j >= 0; j--) {
                if (arr[j] != 0) {
                    bucket.add(arr[j]);
                    arr[j] = 0;
                    if (lastIndex >= 0) {
                        if (bucket.get(lastIndex) == bucket.get(lastIndex + 1)) {
                            answer += 2;
                            bucket.set(lastIndex, 0);
                            bucket.set(lastIndex + 1, 0);
                        }
                    }
                    
                    lineList.set(lineIdx, arr);
                    
                    break;
                }
            }
            bucket.removeIf(f -> f == 0);
        }
        
        return answer;
    }
    
    private Integer[] getLine(int[][] board, int idx) {
        Integer[] line = new Integer[board.length];
        int reverseIdx = board.length - 1;
        
        for (int i = 0; i <= reverseIdx; i++) {
            line[reverseIdx - i] = board[i][idx];
        }
        
        return line;
    }
}
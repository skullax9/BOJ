class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            
            if (val >= 50 && val % 2 == 0) {
                val /= 2;
            } else if (val < 50 && val % 2 == 1) {
                val *= 2;
            }
            
            answer[i] = val;
        }
        
        return answer;
    }
}
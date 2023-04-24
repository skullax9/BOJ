class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for (int i : num_list) {
            int k = i;
            
            while (k != 1) {
                if (k % 2 == 0) {
                    k /= 2;
                    
                    answer++;
                } else {
                    k -= 1;
                    k /= 2;
                    answer++;
                }
            }
        }
        
        return answer;
    }
}
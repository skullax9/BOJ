class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length / n;
        
        if (num_list.length % n > 0) len++;
        
        int[] answer = new int[len];
        
        for (int i = 0; i < num_list.length; i+=n){
            answer[i / n] = num_list[i];
        }
        
        return answer;
    }
}
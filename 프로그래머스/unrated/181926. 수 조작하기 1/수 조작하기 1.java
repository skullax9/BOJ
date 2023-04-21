class Solution {
    public int solution(int n, String control) {
        int answer = n;
        
        for (int i = 0; i < control.length(); i++) {
            char c = control.charAt(i);
            
            if (c == 'w') answer++;
            if (c == 's') answer--;
            if (c == 'd') answer += 10;
            if (c == 'a') answer -= 10;
        }
        
        return answer;
    }
}
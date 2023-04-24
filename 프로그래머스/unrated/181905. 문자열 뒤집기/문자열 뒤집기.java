class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder();
        StringBuilder reverse = new StringBuilder();
        
        reverse.append(my_string.substring(s, e + 1));
        
        for (int i = 0; i < s; i++) {
            answer.append(my_string.charAt(i));
        }
        
        answer.append(reverse.reverse().toString());
        
        for (int i = e + 1; i < my_string.length(); i++) {
            answer.append(my_string.charAt(i));
        }
        
        return answer.toString();
    }
}
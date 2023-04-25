class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        
        StringBuilder sb = new StringBuilder();
        int index = 0;
        
        
        for (String s : picture) {
            for (String p : s.split("")) {
                sb.append(p.repeat(k));
            }
            for (int i = 0; i < k; i++) {
                answer[index++] = sb.toString();
            }
            sb.setLength(0);
        }
        
        return answer;
    }
}
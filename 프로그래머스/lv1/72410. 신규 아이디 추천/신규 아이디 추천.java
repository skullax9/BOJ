class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        answer = new_id.toLowerCase(); // 소문자 치환
        
        answer = answer.replaceAll("[^\\w\\-_.]*","");
        
        answer = answer.replaceAll("\\.{2,}", ".");
        
        answer = answer.replaceAll("^[.]|[.]$","");
        
        if (answer == null || answer.length() == 0) {
            answer = "a";
        }

        if (answer.length() >= 16) {
            answer = answer.substring(0,15);
            answer = answer.replaceAll("[.]$","");
        }

        if (answer.length() <= 2) {
            String lastname = String.valueOf(answer.charAt(answer.length() - 1));
            for (int i = answer.length(); i <= 2; i++ ) {
                answer += lastname;
            }
        }
        
        return answer;
    }
}
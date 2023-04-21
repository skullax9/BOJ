class Solution {
    public String solution(String myString) {
        char[] carr = myString.toCharArray();
        
        StringBuilder sb = new StringBuilder();
        
        for (char c : carr) {
            sb.append(c < 'l' ? 'l' : c);
        }
        
    
        return sb.toString();
    }
}
class Solution {
    public String solution(String n_str) {
        int idx = 0;
        
        for (int i = 0; i < n_str.length(); i++) {
            if (n_str.charAt(i) != '0') break;
            else idx++;
        }
        
        return n_str.substring(idx);
    }
}
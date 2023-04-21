class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder sb = new StringBuilder();
        
        for (String s : str_list) {
            sb.append(s.contains(ex) ? "" : s);
        }
        
        return sb.toString();
    }
}
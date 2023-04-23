class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        
        for (String s : myString.split("")) {
            sb.append(s.equals("A") ? "B" : "A");
        }
        
        return sb.toString().contains(pat) ? 1 : 0;
    }
}
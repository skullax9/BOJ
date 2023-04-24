class Solution {
    public String solution(String myString, String pat) {
        int maxLen = -1;
        
        for (int i = 0; i <= myString.length(); i++) {
            String str = myString.substring(0, i);
            
            if (str.endsWith(pat)) {
                maxLen = str.length();
            }
        }
        
        return myString.substring(0, maxLen);
    }
}
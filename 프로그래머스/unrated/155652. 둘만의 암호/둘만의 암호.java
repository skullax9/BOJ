class Solution {
    public String solution(String s, String skip, int index) {
        char[] charArray = s.toCharArray();
        
        for (int i = 0; i < charArray.length; i++) {
			for (int j = 0; j < index; j++) {
                do {
                    charArray[i]++;
                    
                    charArray[i] = charArray[i] > 122 ? 97 : charArray[i];
                } while (skip.contains(String.valueOf(charArray[i])));
			}
		}
        
        return String.valueOf(charArray);
    }
}
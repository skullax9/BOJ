class Solution {
    public int solution(int a, int b) {
        Double db = (double) a / (double) b;

        String dbStr = String.valueOf(db);

		String[] split = dbStr.split("");
        
        return split.length >= 16 ? 2 : 1;
    }
}
class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int line = (n / w) + (n % w > 0 ? 1 : 0);
        int[][] newAnswer = new int[line][w];
        int idx = 0;
        
        for (int i = line; i >= 1; i--) {
            int[] arr = new int[w];
            if (i % 2 == 0) {
                for (int j = 0; j < w; j++) {
                    arr[j] = ((i * w) - j) > n ? -1 : ((i * w) - j);
                }
            } else {
                for (int j = 0; j < w; j++) {
                    arr[j] = ((i * w) - (w - (j + 1))) > n ? -1 : ((i * w) - (w - (j + 1)));
                }
            }
            newAnswer[idx++] = arr;
        }
        
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < w; j++) {
                if (newAnswer[i][j] == num) {
                    answer = newAnswer[0][j] != -1 ? (i + 1) : i;
                }
            }
        }
        
        return answer;
    }
}
class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 4;
        
        String stdColor = board[h][w];
        
        if (h - 1 < 0 || !board[h - 1][w].equals(stdColor)) answer--;
        if (w - 1 < 0 || !board[h][w - 1].equals(stdColor)) answer--;
        if (h + 1 == board.length || !board[h + 1][w].equals(stdColor)) answer--;
        if (w + 1 == board.length || !board[h][w + 1].equals(stdColor)) answer--;
        
        return answer;
    }
}
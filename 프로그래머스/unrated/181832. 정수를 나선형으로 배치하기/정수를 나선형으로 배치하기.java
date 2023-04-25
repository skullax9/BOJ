class Solution {
    public int[][] solution(int n) {
        int[][] arr = new int[n][n];
        
        int num = 1; // 초기화할 값
        int r = 0, c = 0; // 배열의 행과 열 인덱스
        int dir = 0; // 이동 방향(우, 하, 좌, 상)
        int[] dr = {0, 1, 0, -1}; // 행 이동 값
        int[] dc = {1, 0, -1, 0}; // 열 이동 값

        for (int i = 0; i < n*n; i++) {
            arr[r][c] = num++; // 현재 위치에 값 할당
            
            // 다음 위치 계산
            int nr = r + dr[dir];
            int nc = c + dc[dir];
    
            // 배열 경계를 벗어나거나 이미 값이 할당된 경우 방향을 바꿈
            if (nr < 0 || nr >= n || nc < 0 || nc >= n || arr[nr][nc] != 0) {
                dir = (dir + 1) % 4; // 방향 전환
                nr = r + dr[dir];
                nc = c + dc[dir];
            }
    
            r = nr;
            c = nc;
        }
        
        return arr;
    }
}
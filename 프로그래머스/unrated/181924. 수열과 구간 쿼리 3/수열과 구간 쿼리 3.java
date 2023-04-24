class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int org = arr[queries[i][0]];
            
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = org;
        }
        
        return arr;
    }
}
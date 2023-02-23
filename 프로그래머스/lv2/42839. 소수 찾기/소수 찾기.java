import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String numbers) {
        int answer = 0;
        
        String[] nums = numbers.split("");
        
        Arrays.sort(nums, Collections.reverseOrder());
        
        int max = Integer.parseInt(String.join("", nums));
        
        boolean[] arr = new boolean[max + 1];
		List<String> prime = new ArrayList<>();

		makePrime(arr , max);

        int cnt = 0;
        
		for (int i = 0; i < arr.length; i++) {
			if (!arr[i]) {
                String p = String.valueOf(i);
                
                if (numbers.contains(p)) {
                    cnt++;
                } else {
                    for (String s : nums) {
                        p = p.replaceFirst(s, "");
                    }
                    
                    cnt += p.isEmpty() ? 1 : 0;
                }
            }
		}
        
        return cnt;
    }
    
    public static void makePrime(boolean[] arr,int N) {
		if (N < 2) return;

		arr[0] = arr[1] = true;
		
		for (int i = 2; i <= Math.sqrt(N); i++) {
			if (arr[i]) continue;

			for (int j = i * i; j < arr.length; j = j + i) {
				arr[j] = true;
			}
		}
	}
}
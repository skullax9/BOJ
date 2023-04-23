class Solution {
    public int solution(String binomial) {
        String[] arr = binomial.split(" ");
        
        if (arr[1].equals("+")) {
            return parse(arr[0]) + parse(arr[2]);
        } else if (arr[1].equals("-")) {
            return parse(arr[0]) - parse(arr[2]);
        } else {
            return parse(arr[0]) * parse(arr[2]);
        }
    }
    
    public int parse(String s) {
        return Integer.parseInt(s);
    }
}
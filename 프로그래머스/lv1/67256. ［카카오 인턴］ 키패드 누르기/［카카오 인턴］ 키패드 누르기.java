class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        
        String main = hand.substring(0,1).toUpperCase();
        
        String loc = "*";
        String roc = "#";
        
        String def = "134679";
        String left = "147*";
        String center = "2580";
        String right = "369#";
        String[] hands = {"L", "R"};
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0 && numbers[i] % 3 == 0 || numbers[i] % 3 == 1) {
                int index = def.indexOf(numbers[i]+"") % 2;
                
                answer.append(hands[index]);
                
                if (index == 0) loc = numbers[i] + "";
                if (index == 1) roc = numbers[i] + "";
                
                continue;
            }
            
            if (numbers[i] % 3 == 2 || numbers[i] == 0) {
                int leftGap = (int) Math.abs(left.indexOf(loc) - center.indexOf(numbers[i]+"")) + 1;
                int rightGap = (int) Math.abs(right.indexOf(roc) - center.indexOf(numbers[i]+"")) + 1;
                
                if (center.indexOf(loc + "") > -1) {
                    leftGap = (int) Math.abs(center.indexOf(loc) - center.indexOf(numbers[i]+""));
                }
                
                if (center.indexOf(roc + "") > -1) {
                    rightGap = (int) Math.abs(center.indexOf(roc) - center.indexOf(numbers[i]+""));
                }
                
                if (leftGap == rightGap) {
                    answer.append(main);
                    
                    loc = main.equals("L") ? numbers[i] + "" : loc;
                    roc = main.equals("R") ? numbers[i] + "" : roc;
                    
                    continue;
                }
                
                if (leftGap < rightGap) {
                    answer.append("L");
                    loc = numbers[i] + "";
                    continue;
                } else {
                    answer.append("R");
                    roc = numbers[i] + "";
                    continue;
                }
            }
        }
        
        return answer.toString();
    }
}
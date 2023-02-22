import java.util.*;
import java.time.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answers = new ArrayList<>();
        
        String[] date = today.split("[.]");
        
        LocalDate ld = LocalDate.of(parse(date[0]), parse(date[1]), parse(date[2]));
                
        for (int i = 0; i < terms.length; i++) {
            terms[i] = terms[i].replaceAll(" ","");
        }
        
        for (int i = 0; i < privacies.length; i++) {
            String[] arr = privacies[i].split(" ");
            String[] newDate = arr[0].split("[.]");
            
            int months = 0;
            
            for (String term : terms) {
                if (term.indexOf(arr[1]) != -1) {
                    months = parse(term.replace(arr[1], ""));
                    
                    LocalDate plusMonth = LocalDate.of(parse(newDate[0]),parse(newDate[1]),parse(newDate[2])).plusMonths(months);
                    
                    if (ld.isAfter(plusMonth) || ld.isEqual(plusMonth)) {
                        answers.add(i + 1);
                        System.out.println(i+1);
                        break;
                    }
                }
            }
        }
        
        int[] answer = answers.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
    
    private int parse(String s) {
        return Integer.parseInt(s);
    }
}
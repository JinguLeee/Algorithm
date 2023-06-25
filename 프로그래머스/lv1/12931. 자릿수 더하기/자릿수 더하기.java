import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        char[] charArr = ("" + n).toCharArray();
        for (char c : charArr){
            answer += Integer.parseInt("" + c);
        }
        return answer;
    }
}
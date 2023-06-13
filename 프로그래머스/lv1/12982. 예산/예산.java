import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        
        int answer = 0;
        int sum = 0;
        for (; answer < d.length; answer++) {
            sum += d[answer];
            if (sum > budget) break;
        }
        return answer;
    }
}
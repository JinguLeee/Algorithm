import java.util.*;

class Solution {
    public long solution(int balls, int share) {
        long answer = 1;
        share = (balls-share > share ? balls-share : share);
        for (int i = 1; i<= balls-share; i++) {
            answer *= (i+share);
            answer /= i;
        }
        
        return answer;
    }
}
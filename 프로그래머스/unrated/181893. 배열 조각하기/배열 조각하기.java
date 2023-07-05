import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {0, query.length - 1};
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) answer[1] = answer[0] + query[i];
            else answer[0] = answer[0] + query[i];
        }
        
        return Arrays.copyOfRange(arr, answer[0], answer[1] + 1);
    }
}
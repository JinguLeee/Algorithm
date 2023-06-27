import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> iArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            if (i > 0 && arr[i] == arr[i-1]) continue;
            iArr.add(arr[i]);
        }
        int [] answer = new int[iArr.size()];
        for (int i = 0; i < iArr.size(); i++){
            answer[i] = iArr.get(i);
        }
        return answer;
    }
}
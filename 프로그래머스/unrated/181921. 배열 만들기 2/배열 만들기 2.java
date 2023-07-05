import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            boolean b = true;
            char[] num = String.valueOf(i).toCharArray();
            for (char c : num) {
                if (c != '0' && c != '5') {
                    b = false;
                    break;
                }
            }
            if (b == true) integerList.add(i);
        }

        if (integerList.size() == 0) return new int[] {-1};
        
        int[] answer = new int[integerList.size()];
        for (int i = 0; i < integerList.size(); i++) answer[i] = integerList.get(i);
        return answer;
    }
}
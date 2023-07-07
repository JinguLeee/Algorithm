import java.util.*;
class Solution {
    public int solution(int[][] lines) {
        int answer = 0;

        HashMap<Integer, Integer> lineMap = new HashMap<>();
        for (int[] line : lines) {
            for (int i = line[0]; i < line[1]; i++) {
                lineMap.put(i, lineMap.getOrDefault(i, 0) + 1);
            }
        }

        for (Integer integer : lineMap.keySet()) {
            if (lineMap.get(integer) >= 2) answer++;
        }
        return answer;
    }
}
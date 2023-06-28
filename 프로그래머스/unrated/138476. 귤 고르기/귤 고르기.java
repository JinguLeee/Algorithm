import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        HashMap<Integer, Integer> tangerineMap = new HashMap<>();
        for (int i : tangerine) tangerineMap.put(i, tangerineMap.getOrDefault(i, 0) + 1);

        List<Map.Entry<Integer, Integer>> tangerineList = new ArrayList<>(tangerineMap.entrySet());
        tangerineList.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        int answer = 0;
        for (Map.Entry<Integer, Integer> integerIntegerEntry : tangerineList) {
            k -= integerIntegerEntry.getValue();
            answer++;
            if (k <= 0) break;
        }
        
        return answer;
    }
}
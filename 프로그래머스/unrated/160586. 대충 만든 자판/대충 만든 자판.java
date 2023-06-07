import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        HashMap<Character, Integer> keyHash = new HashMap<>();
        int[] answer = new int[targets.length];

        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                char key = keymap[i].charAt(j);
                if (keyHash.get(key) == null || keyHash.get(key) > j) keyHash.put(key, j + 1);
            }
        }

        for (int i = 0; i < targets.length; i++) {
            int sum = 0;
            for (int j = 0; j < targets[i].length(); j++) {
                char target = targets[i].charAt(j);
                int key = keyHash.getOrDefault(target, -1);
                if (key == -1) {
                    sum = -1;
                    break;
                }
                sum += key;
            }
            answer[i] = sum;
        }
        return answer;
    }
}
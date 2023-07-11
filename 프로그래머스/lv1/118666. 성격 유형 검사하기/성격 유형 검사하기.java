import java.util.*;
class Solution {
     public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<String, Integer> score = new HashMap<>();
        for (int i = 0; i < survey.length; i++) {
            if (choices[i] == 4) continue;
            int num = 4 - choices[i];
            char name = survey[i].charAt(num < 0 ? 1 : 0);
            score.put(String.valueOf(name), score.getOrDefault(String.valueOf(name), 0) + Math.abs(num));
        }

        answer += score.getOrDefault("R", 0) >= score.getOrDefault("T", 0) ? "R" : "T";
        answer += score.getOrDefault("C", 0) >= score.getOrDefault("F", 0) ? "C" : "F";
        answer += score.getOrDefault("J", 0) >= score.getOrDefault("M", 0) ? "J" : "M";
        answer += score.getOrDefault("A", 0) >= score.getOrDefault("N", 0) ? "A" : "N";
        return answer;
    }
}
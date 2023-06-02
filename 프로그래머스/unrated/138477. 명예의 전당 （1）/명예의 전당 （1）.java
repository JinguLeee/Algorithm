import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> scoreList = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            scoreList.add(score[i]);
            Collections.sort(scoreList);
            if (i >= k) scoreList.remove(0);
            answer[i] = scoreList.get(0);
        }
        return answer;
    }
}
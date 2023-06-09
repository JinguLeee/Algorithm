import java.util.*;
class Solution {
    public String solution(int[] food) {
        String answer = "";
        String answer2 = "";
        for (int i = 1; i < food.length; i++) {
            String repeatFood = String.valueOf(i).repeat(food[i]/2);
            answer += repeatFood;
            answer2 = repeatFood + answer2;
        }
        return answer + "0" + answer2;
    }
}
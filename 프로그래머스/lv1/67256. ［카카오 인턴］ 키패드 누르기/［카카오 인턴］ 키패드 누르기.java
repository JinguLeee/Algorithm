class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 9;
        int right = 11;
        hand = (hand.equals("right") ? "R" : "L");
        for (int i = 0; i < numbers.length; i++) {
            int number = (numbers[i] == 0 ? 10 : numbers[i] - 1);
            if (number % 3 == 0) {
                answer+= "L";
                left = number;
            }
            else if (number % 3 == 1) {
                int handNum = handString(left, right, number);
                if (handNum < 0) {
                    answer+= "L";
                    left = number;
                } else if (handNum > 0) {
                    answer+= "R";
                    right = number;
                } else {
                    answer+= hand;
                    if (hand.equals("R")) right = number;
                    else left = number;
                }
            } else {
                answer+= "R";
                right = number;
            }
        }
        return answer;
    }
    private int handString(int left, int right, int now) {
        int nowX = now % 3;
        int nowY = now / 3;
        int leftNum = Math.abs(nowX - (left % 3)) + Math.abs(nowY - (left / 3));
        int RightNum = Math.abs(nowX - (right % 3)) + Math.abs(nowY - (right / 3));
        return leftNum - RightNum;
    }
}
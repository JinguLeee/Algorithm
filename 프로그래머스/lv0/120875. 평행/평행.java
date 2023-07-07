class Solution {
    public int solution(int[][] dots) {
        double num1 = (double)(dots[1][1] - dots[0][1]) / (dots[1][0] - dots[0][0])
                - (double)(dots[3][1] - dots[2][1]) / (dots[3][0] - dots[2][0]);
        if (num1 == 0) return 1;

        double num2 = (double)(dots[2][1] - dots[0][1]) / (dots[2][0] - dots[0][0])
                - (double)(dots[3][1] - dots[1][1]) / (dots[3][0] - dots[1][0]);
        if (num2 == 0) return 1;

        double num3 = (double)(dots[3][1] - dots[0][1]) / (dots[3][0] - dots[0][0])
                - (double)(dots[2][1] - dots[1][1]) / (dots[2][0] - dots[1][0]);
        if (num3 == 0) return 1;

        return 0;
    }
}
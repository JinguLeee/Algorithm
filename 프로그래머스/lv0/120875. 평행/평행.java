class Solution {
    public int solution(int[][] dots) {
        int num1 = (dots[1][1] - dots[0][1]) * (dots[3][0] - dots[2][0])
                - (dots[3][1] - dots[2][1]) * (dots[1][0] - dots[0][0]);
        if (num1 == 0) return 1;

        int num2 = (dots[2][1] - dots[0][1]) * (dots[3][0] - dots[1][0])
                - (dots[3][1] - dots[1][1]) * (dots[2][0] - dots[0][0]);
        if (num2 == 0) return 1;

        int num3 = (dots[3][1] - dots[0][1]) * (dots[2][0] - dots[1][0])
                - (dots[2][1] - dots[1][1]) * (dots[3][0] - dots[0][0]);
        if (num3 == 0) return 1;

        return 0;
    }
}
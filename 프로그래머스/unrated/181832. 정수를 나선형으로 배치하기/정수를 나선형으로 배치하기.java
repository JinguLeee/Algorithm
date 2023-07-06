class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int count = 0;

        boolean b = true;
        int num1 = n-1;
        int num2 = 0;
        int[] numArray = {0, 0};

        while (count < n*n) {
            if (b) {
                for (int i = numArray[1]; i <= num1; i++) answer[numArray[1]][i] = ++count;
                for (int i = numArray[0] + 1; i <= num1; i++) answer[i][num1] = ++count;
                numArray[0] = num1;
                numArray[1] = num1--;
                b = false;
            } else {
                for (int i = numArray[1]-1; i >= num2; i--) answer[numArray[0]][i] = ++count;
                for (int i = numArray[1]-1; i >= num2 + 1; i--) answer[i][num2] = ++count;
                numArray[0] = ++num2;
                numArray[1] = num2;
                b = true;
            }
        }

        return answer;
    }
}
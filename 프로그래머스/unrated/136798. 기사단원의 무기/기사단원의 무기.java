class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            int sum = 0;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (j * j == i) sum++;
                else if (i % j == 0) sum = sum + 2;
                if (sum > limit) {
                    sum = power;
                    break;
                }
            }
            answer += sum;
        }
        return answer;
    }
}
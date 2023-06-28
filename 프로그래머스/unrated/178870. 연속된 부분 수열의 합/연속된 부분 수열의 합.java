class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = {sequence.length-1, sequence.length-1};
        int sum = sequence[sequence.length-1];

        while (true) {
            if (sum == k) break;
            else if (sum > k) {
                sum -= sequence[answer[1]];
                answer[1] -= 1;
            }
            else {
                answer[0] -= 1;
                sum += sequence[answer[0]];
            }
        }
        
        while(answer[0] >= 1 && sequence[answer[0] - 1] == sequence[answer[1]]) {
            answer[0] -= 1;
            answer[1] -= 1;
        }
        return answer;
    }
}
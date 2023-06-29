import java.util.Arrays;

class Solution {
    public int solution(int[][] targets) {
        Arrays.sort(targets, (a, b) -> {
            if (a[0] == b[0]) return Integer.compare(a[1], b[1]);
            else return Integer.compare(a[0], b[0]);
        });
        
        int answer = 1;
        int[] nums = {targets[0][0], targets[0][1]};
        for (int i = 1; i < targets.length; i++) {
            if (nums[1] > targets[i][0]) {
                if (nums[1] > targets[i][1]) nums[1] = targets[i][1];
                continue;
            }
            answer++;
            nums[0] = targets[i][0];
            nums[1] = targets[i][1];
        }
        return answer;
    }
}
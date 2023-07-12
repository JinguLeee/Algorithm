import java.util.Arrays;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        int zero = 7;
        int win = 7;
        for (int i = 0; i < lottos.length; i++){
            if (lottos[i] == 0) {
                zero--;
                continue;
            }
            for (int j = 0; j < win_nums.length; j++){
                if (lottos[i] == win_nums[j]){
                    win--;
                    zero--;
                    break;
                }
            }
        }
        return new int[] {(zero > 6 ? 6 : zero), (win > 6 ? 6 : win)};
    }
}
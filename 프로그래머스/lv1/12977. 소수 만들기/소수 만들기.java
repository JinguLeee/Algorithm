import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length-2; i++){
            for (int j = i+1; j < nums.length-1; j++){
                for (int k = j+1; k< nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];

                    for (int l = 2; l <= sum/2; l++){
                        if (sum % l == 0) {
                            count--;
                            break;
                        }
                    }
                    count++;
                }
            }
        }
        return count;
    }
}
import java.util.*;
class Solution {
    public int solution(int[] nums) {
        Arrays.sort(nums);
        int sum = nums.length - 1;
        sum = nums[sum] + nums[sum-1] + nums[sum-2];
        
        HashSet<Integer> numSet = new HashSet<>();
        for (int i = 2; i <= sum; i++) numSet.add(i);
        for (int i = 2; i <= sum/2; i++){
            int num = i;
            while ((num += i) <= sum) {
                numSet.remove(num);
            }
        }

        int count = 0;
        for (int i = 0; i < nums.length-2; i++){
            for (int j = i+1; j < nums.length-1; j++){
                for (int k = j+1; k< nums.length; k++) {
                    if (numSet.contains(nums[i] + nums[j] + nums[k])) count++;
                }
            }
        }
        return count;
    }
}
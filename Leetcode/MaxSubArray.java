public class Solution {
    public int maxSubArray(int[] nums) {
        int temp = nums[0];
        int sum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            temp = Math.max(temp+nums[i], nums[i]);
            sum = Math.max(sum, temp);
        }

        return sum;
    }
}
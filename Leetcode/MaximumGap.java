public class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        
        for (int i = 0; i < nums.length-1; i++) {
            result = Math.max(result, nums[i+1]-nums[i]);
        }
        return result;
    }
}
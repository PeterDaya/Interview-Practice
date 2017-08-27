class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] <<= 1;
        }
        
        if (S > sum)
            return 0;
        
        return help(nums, S+sum);
    }
    
    public int help(int[] nums, int S) {
        int[][] arr = new int[nums.length+1][S+1];
        arr[0][0] = 1;
        
        for (int i = 1; i <= nums.length; i++) {
            for (int j = 0; j <= S; j++) {
                arr[i][j] = arr[i-1][j];
                int cur = nums[i-1];
                
                if (j - cur >= 0)
                    arr[i][j] += arr[i-1][j-cur];
            }
        }
        
        return arr[nums.length][S];
    }
}
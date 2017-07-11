public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxone  = 0;
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                if (count > maxone)
                    maxone = count;
            }
            else
                count = 0;
        }
        
        return maxone;
    }
}
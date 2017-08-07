public class Solution {
    public int[] nums;
    public int[] shuffledNums;
    Random rand;
    
    public Solution(int[] nums) {
        this.nums = nums;
        shuffledNums = Arrays.copyOf(nums, nums.length);
        rand = new Random();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        shuffledNums = Arrays.copyOf(nums, nums.length);
        return shuffledNums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int len = shuffledNums.length;
        
        for (int i = 0; i < len; i++) {
            int num = rand.nextInt(len-i);
            int temp = shuffledNums[i];
            shuffledNums[i] = shuffledNums[num + i];
            shuffledNums[num + i] = temp;
        }
        
        return shuffledNums;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
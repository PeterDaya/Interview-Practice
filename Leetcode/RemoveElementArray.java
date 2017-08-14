public class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        int size = nums.length;
        
        for (int i = 0; i < size; i++) {
            if (nums[i] != val)
                nums[index++] = nums[i];
        }
        return index;
    }
}
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        
        int lower = getLower(nums, target);
        int higher = getHigher(nums, target);
        
        if (lower <= higher) {
            res[0] = lower;
            res[1] = higher;
        }
        return res;
    }
    
    public int getLower(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        
        while (left <= right) {
            int mid = (left+right)/2;
            if (nums[mid] < target)
                left = mid+1;
            else
                right = mid-1;
        }
        return left;
    }
    
    public int getHigher(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        
        while (left <= right) {
            int mid = (left+right)/2;
            if (nums[mid] <= target)
                left = mid+1;
            else
                right = mid-1;
        }
        return right;
        
    }
}
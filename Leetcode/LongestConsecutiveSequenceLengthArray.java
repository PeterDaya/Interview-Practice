class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        
        HashSet<Integer> set = new HashSet<Integer>();
        int max = 1;
        
        for (int i: nums)
            set.add(i);
        
        for (int i: nums) {
            int left = i-1;
            int right = i+1;
            int count = 1;
            
            while (set.contains(left)) {
                count++;
                set.remove(left);
                left--;
            }
            
            while (set.contains(right)) {
                count++;
                set.remove(right);
                right++;
            }
            
            max = Math.max(max, count);
        }
        
        return max;
    }
}
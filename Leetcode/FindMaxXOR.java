class Solution {
    public int findMaximumXOR(int[] nums) {
        int max = 0;
        int mask = 0;
        
        for (int i = 31; i >= 0; i--) {
            mask |= (1 << i);
            Set<Integer> set = new HashSet<Integer>();
            
            for (int n: nums)
                set.add(mask & n);
            
            int temp = max | (1 << i);
            for (int numbers: set) {
                if (set.contains(temp^numbers)) {
                    max = temp;
                    break;
                }
            }
        }
        
        return max;
    }
}
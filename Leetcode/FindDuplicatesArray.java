public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> mylist = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]))
                mylist.add(nums[i]);
            else
                set.add(nums[i]);
        }
        
        return mylist;
    }
}
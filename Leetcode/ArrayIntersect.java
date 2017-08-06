public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i: nums1) {
            if (map.containsKey(i))
                map.put(i, map.get(i) + 1);
            else
                map.put(i, 1);
        }
        
        ArrayList<Integer> mylist = new ArrayList<Integer>();
        for (int i: nums2) {
            if (map.containsKey(i)) {
                if (map.get(i) > 1)
                    map.put(i, map.get(i) - 1);
                else
                    map.remove(i);
                
                mylist.add(i);
            }
        }
        
        int[] ret = new int[mylist.size()];
        
        for (int i = 0; i < mylist.size(); i++)
            ret[i] = mylist.get(i);
        
        return ret;
    }
}
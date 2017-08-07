public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i: nums) {
            if (map.containsKey(i))
                map.put(i, map.get(i) + 1);
            else
                map.put(i, 1);
        }
        
        int max = 0;
        for (Map.Entry<Integer, Integer> entry: map.entrySet())
            max = Math.max(max, entry.getValue());
        
        ArrayList<Integer>[] numbers = (ArrayList<Integer>[]) new ArrayList[max+1];
        for (int i = 1; i <= max; i++)
            numbers[i] = new ArrayList<Integer>();
        
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int freq = entry.getValue();
            int num = entry.getKey();
            numbers[freq].add(num);
        }
        
        List<Integer> ret = new ArrayList<Integer>();
        
        for (int i = max; i >= 1; i--) {
            if (numbers[i].size() > 0)
                for (int j: numbers[i])
                    ret.add(j);
            
            if (ret.size() == k)
                break;
        }
        return ret;
    }
}
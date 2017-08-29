class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (numRows <= 0)
            return result;
        
        ArrayList<Integer> first = new ArrayList<Integer>();
        first.add(1);
        result.add(first);
        
        for (int i = 2; i <= numRows; i++) {
            ArrayList<Integer> cur = new ArrayList<Integer>();
            cur.add(1);
            
            for (int j = 0; j < first.size()-1; j++)
                cur.add(first.get(j)+first.get(j+1));
            
            cur.add(1);
            result.add(cur);
            first = cur;
        }
        
        return result;
    }
}
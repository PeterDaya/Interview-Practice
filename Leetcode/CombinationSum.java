public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> mylist = new ArrayList<List<Integer>>();
        ArrayList<Integer> path = new ArrayList<Integer>();
        
        helper(candidates, target, 0, path, mylist);
        return mylist;
    }
    
    public void helper(int[] candidates, int target, int begin, ArrayList<Integer> path, List<List<Integer>> mylist) {
        if (target == 0) {
            ArrayList<Integer> add = new ArrayList<Integer>(path);
            mylist.add(add);
            return;
        }
        
        for (int i = begin; i < candidates.length && target >= candidates[i]; i++) {
            path.add(candidates[i]);
            helper(candidates, target-candidates[i], i, path, mylist);
            path.remove(path.size() - 1);
        }
    }
}
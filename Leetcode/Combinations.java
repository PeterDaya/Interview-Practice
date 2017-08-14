public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> mylist = new ArrayList<List<Integer>>();
        ArrayList<Integer> path = new ArrayList<Integer>();
        helper(n, k, 1, path, mylist);
        return mylist;
    }
    
    public void helper(int n, int k, int begin, ArrayList<Integer> path, List<List<Integer>> mylist) {
        int pathSize = path.size();
        if (pathSize == k) {
            ArrayList<Integer> p = new ArrayList<Integer>(path);
            mylist.add(p);
            return;
        }
        for (int i = begin; i <= n-(k-pathSize)+1; ++i) {
            path.add(i);
            helper(n,k,i+1, path, mylist);
            path.remove(path.size() - 1);
        }
    }
}
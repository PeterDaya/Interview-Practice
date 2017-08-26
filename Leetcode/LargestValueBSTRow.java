/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> mylist = new ArrayList<Integer>();
        
        if (root == null)
            return mylist;
        help(root, 0, mylist);
        return mylist;
    }
    
    public void help(TreeNode root, int depth, List<Integer> mylist) {
        if (root == null)
            return;
        
        if (depth == mylist.size())
            mylist.add(root.val);
        else
            mylist.set(depth, Math.max(mylist.get(depth), root.val));
        
        help(root.left, depth+1, mylist);
        help(root.right, depth+1, mylist);
    }
}
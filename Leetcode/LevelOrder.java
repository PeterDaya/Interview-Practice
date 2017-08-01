/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> mylist = new ArrayList<List<Integer>>();
        if (root == null)
            return mylist;
        
        levelOrder(root, 0, mylist);
        return mylist;
    }
    
    public void levelOrder(TreeNode root, int level, List<List<Integer>> mylist) {
        if (root == null)
            return;
        
        if (level == mylist.size())
            mylist.add(new ArrayList<Integer>());
        
        mylist.get(level).add(root.val);
        levelOrder(root.left, level+1, mylist);
        levelOrder(root.right, level+1, mylist);
    }
}
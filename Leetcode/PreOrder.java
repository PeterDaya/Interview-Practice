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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> mylist = new ArrayList<Integer>();
        
        if (root == null)
            return mylist;
        
        preOrder(root, mylist);
        return mylist;
    }
    
    public void preOrder(TreeNode root, List<Integer> mylist) {
        if (root == null)
            return;
        mylist.add(root.val);
        preOrder(root.left, mylist);
        preOrder(root.right, mylist);
    }
}
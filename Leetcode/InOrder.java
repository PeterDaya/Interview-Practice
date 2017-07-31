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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> mylist = new ArrayList<Integer>();
        
        if (root == null)
            return mylist;
        
        inOrder(root, mylist);
        return mylist;
    }
    
    public void inOrder(TreeNode root, List<Integer> mylist) {
        if (root == null)
            return;
        inOrder(root.left, mylist);
        mylist.add(root.val);
        inOrder(root.right, mylist);
    }
}
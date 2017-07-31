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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> mylist = new ArrayList<Integer>();
        
        if (root == null)
            return mylist;
        postOrder(root, mylist);
        return mylist;
    }
    
    public void postOrder(TreeNode root, List<Integer> mylist) {
        if (root == null)
            return;
        postOrder(root.left, mylist);
        postOrder(root.right, mylist);
        mylist.add(root.val);
    }
}
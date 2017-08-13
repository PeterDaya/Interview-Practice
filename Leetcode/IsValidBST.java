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
    public boolean isValidBST(TreeNode root) {
        return help(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    public boolean help(TreeNode root, int min, int max) {
        if (root == null)
            return true;
        
        if (root.val < min || root.val > max)
            return false;
        
        return help(root.left, min, root.val-1) && help(root.right, root.val+1, max);
    }
}
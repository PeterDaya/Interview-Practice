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
    public int findTilt(TreeNode root) {
        int[] ret = new int[1];
        help(root, ret);
        return ret[0];
    }
    
    public int help(TreeNode root, int[] ret) {
        if (root == null)
            return 0;
        
        int left = help(root.left, ret);
        int right = help(root.right, ret);
        ret[0] += Math.abs(left-right);
        return left+right+root.val;
    }
}
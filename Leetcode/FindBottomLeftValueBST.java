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
    public int findBottomLeftValue(TreeNode root) {
        if (root == null)
            return 0;
        
        int[] res = new int[1];
        res[0] = root.val;
        int maxDepth = 1;
        
        help(root, 1, maxDepth, res);
        return res[0];
    }
    
    public void help(TreeNode root, int depth, int maxDepth, int[] res) {
        if (root == null)
            return;
        
        if (depth > maxDepth) {
            res[0] = root.val;
            maxDepth = depth;
        }
        
        help(root.left, depth+1, maxDepth, res);
        help(root.right, depth+1, maxDepth, res);
    }
}
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
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if (root == null)
            return null;
        
        if (d == 1) {
            TreeNode add = new TreeNode(v);
            add.left = root;
            return add;
        }
        
        help(root, v, 1, d);
        return root;
    }
    
    public void help(TreeNode root, int v, int level, int d) {
        if (root == null)
            return;
        
        if (level == d-1) {
            TreeNode left = root.left;
            TreeNode right = root.right;
            root.left = new TreeNode(v);
            root.left.left = left;
            root.right = new TreeNode(v);
            root.right.right = right;
            return;
        }
        
        help(root.left, v, level+1, d);
        help(root.right, v, level+1, d);
    }
}
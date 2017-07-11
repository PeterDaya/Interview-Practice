/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
public class MaxDepthBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        
        else {
            int a = maxDepth(root.left);
            int b = maxDepth(root.right);
            
            if (a > b)
                return a+1;
            else
                return b+1;
        }
        
    }
}
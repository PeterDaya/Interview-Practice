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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int preStart = 0;
        int preEnd = preorder.length-1;
        int inStart = 0;
        int inEnd = inorder.length-1;
        
        return construct(preorder, preStart, preEnd, inorder, inStart, inEnd);
    }
    
    public TreeNode construct(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd)
            return null;
        
        int num = preorder[preStart];
        TreeNode node = new TreeNode(num);
        
        int x = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (num == inorder[i]) {
                x = i;
                break;
            }
        }
        
        node.left = construct(preorder, preStart+1, preStart+x-inStart, inorder, inStart, x-1);
        node.right = construct(preorder, preStart+x-inStart+1, preEnd, inorder, x+1, inEnd);
        
        return node;
    }
}
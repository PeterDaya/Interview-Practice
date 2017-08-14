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
    public void recoverTree(TreeNode root) {
        if (root == null)
            return;
        
        ArrayList<TreeNode> mylist = new ArrayList<TreeNode>();
        inOrder(root, mylist);
        
        TreeNode node1 = null;
        TreeNode node2 = null;
        
        for (int i = 1; i < mylist.size(); i++) {
            if (mylist.get(i).val > mylist.get(i-1).val)
                continue;
            
            if (node1 == null)
                node1 = mylist.get(i-1);
            
            node2 = mylist.get(i);
        }
        
        if (node1 == null)
            return;
        
        int temp = node1.val;
        node1.val = node2.val;
        node2.val = temp;
    }
    
    public void inOrder(TreeNode root, ArrayList<TreeNode> mylist) {
        if (root == null)
            return;
        
        inOrder(root.left, mylist);
        mylist.add(root);
        inOrder(root.right, mylist);
    }
}
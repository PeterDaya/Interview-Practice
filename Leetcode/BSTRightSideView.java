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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> mylist = new ArrayList<Integer>();
        
        if (root == null)
            return mylist;
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        
        while (q.size() > 0) {
            int size = q.size();
            
            for (int i = 0; i < size; i++) {
                TreeNode top = q.remove();
                
                if (i == 0)
                    mylist.add(top.val);
                
                if (top.right != null)
                    q.add(top.right);
                
                if (top.left != null)
                    q.add(top.left);
                
            }
        }
        
        return mylist;
    }
}
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
    public ArrayList<Integer> getBSTData(TreeNode root) {
        ArrayList<Integer> mylist = new ArrayList<Integer>();
        
        if (root == null)
            return mylist;
        getList(root, mylist);
        return mylist;
    }
    
    public void getList(TreeNode root, ArrayList<Integer> mylist) {
        if (root == null)
            return;
        getList(root.left, mylist);
        mylist.add(root.val);
        getList(root.right, mylist);
    }
    
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> mylist = getBSTData(root);
        
        return mylist.get(k-1);
        
    }
}
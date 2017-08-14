/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
    private TreeNode root;
    private Stack<TreeNode> mystack;
    
    public BSTIterator(TreeNode root) {
        this.root = root;
        mystack = new Stack<TreeNode>();
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if (mystack.isEmpty() && root == null)
            return false;
        else
            return true;
    }

    /** @return the next smallest number */
    public int next() {
        if (mystack.isEmpty() && root == null)
            return -1;
        
        while (root != null) {
            mystack.push(root);
            root = root.left;
        }
        
        int num = 0;
        root = mystack.pop();
        num = root.val;
        root = root.right;
        return num;
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
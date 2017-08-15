/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
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
    public ListNode mynode;
    
    public TreeNode sortedListToBST(ListNode head) {
        int len = 0;
        mynode = head;
        
        while (head != null) {
            len++;
            head = head.next;
        }
        return helper(len);
    }
    
    public TreeNode helper(int len) {
        if (len == 0)
            return null;
        
        int mid = len/2;
        TreeNode left = helper(mid);
        TreeNode root = new TreeNode(mynode.val);
        
        root.left = left;
        mynode = mynode.next;
        root.right = helper(len-mid-1);
        
        return root;
    }
}
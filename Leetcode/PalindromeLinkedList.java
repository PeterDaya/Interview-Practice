/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode reversed = reverseClone(head);
        return isEqual(head, reversed);
    }
    
    public ListNode reverseClone(ListNode node) {
        ListNode head = null;
        ListNode temp = node;
        
        while (temp != null) {
            ListNode add = new ListNode(temp.val);
            //add.val = temp.val;
            add.next = head;
            head = add;
            temp = temp.next;
        }
        return head;
    }
    
    public boolean isEqual(ListNode h1, ListNode h2) {
        if (h1 == null && h2 == null)
            return true;
        else if (h1 == null || h2 == null)
            return false;
        
        while (h1 != null && h2 != null) {
            if (h1.val != h2.val)
                return false;
            h1 = h1.next;
            h2 = h2.next;
        }
        if (h1 == null && h2 == null)
            return true;
        else
            return false;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode leftSpace = new ListNode(0);
        ListNode rightSpace = new ListNode(0);
        
        ListNode lhead = leftSpace;
        ListNode rhead = rightSpace;
        
        for (ListNode temp = head; temp != null; temp = temp.next) {
            if (temp.val < x) {
                lhead.next = temp;
                lhead = lhead.next;
            }
            else {
                rhead.next = temp;
                rhead = rhead.next;
            }
        }
        
        lhead.next = rightSpace.next;
        rhead.next = null;
        
        return leftSpace.next;
    }
}
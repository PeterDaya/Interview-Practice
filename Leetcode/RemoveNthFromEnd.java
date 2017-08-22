/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null)
            return null;
        
        ListNode temp = head;
        int len = 0;
        
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        
        int dist = len-n;
        
        if (dist == 0) {
            head = head.next;
            return head;
        }
        
        temp = head;
        while (--dist > 0)
            temp = temp.next;
        
        temp.next = temp.next.next;
        
        return head;
        
    }
}
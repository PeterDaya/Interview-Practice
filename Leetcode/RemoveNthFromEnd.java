/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null)
            return null;
        
        int len = 0;
        ListNode node = head;
        
        while (node != null) {
            len++;
            node = node.next;
        }
        
        if (len == 1 && n == 1)
            return null;
        
        int dist = len-n+1;
        
        if (dist == 1) {
            head = head.next;
            return head;
        }
        
        node = head;
        dist = dist-1;
        while (--dist > 0) {
            node = node.next;
        }
        
        node.next = node.next.next;
        return head;
    }
}
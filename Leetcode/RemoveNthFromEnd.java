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
        
        ListNode node = head;
        int len = 0;
        
        while (node != null) {
            node = node.next;
            len++;
        }
        
        int dist = len-n+1;
        if (dist == 1) {
            head = head.next;
            return head;
        }
        
        int i = 0;
        node = head;
        
        while (node != null) {
            i++;
            if (i == (dist-1))
                node.next = node.next.next;
            
            node = node.next;
        }
        return head;
    }
}
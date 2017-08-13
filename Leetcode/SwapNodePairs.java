/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        
        ListNode node1 = head;
        ListNode node2 = head.next;
        
        node1.next = node2.next;
        node2.next = node1;
        node1.next = swapPairs(node1.next);
        return node2;
    }
}
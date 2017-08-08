/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null)
            return null;
        
        ListNode ret = head;
        ListNode node1 = head;
        ListNode node2 = head.next;
        ListNode connect = head.next;
        
        while (node1 != null && node2 != null) {
            ListNode temp = node2.next;
            if (temp == null)
                break;
            
            node1.next = node2.next;
            node1 = node1.next;
            
            node2.next = node1.next;
            node2 = node2.next;
            
        }
        
        node1.next = connect;
        return ret;
    }
}
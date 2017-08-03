/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0)
            return null;
        else if (lists.length == 1)
            return lists[0];
        else if (lists.length == 2) {
            ListNode ret = merge(lists[0], lists[1]);
            return ret;
        }
        
        ListNode ret = merge(lists[0], lists[1]);
        for (int i = 2; i < lists.length; i++) {
            ret = merge(ret, lists[i]);
        }
        
        return ret;
    }
    
    public ListNode merge(ListNode node1, ListNode node2) {
        if (node1 == null)
            return node2;
        else if (node2 == null)
            return node1;
        
        if (node1.val <= node2.val) {
            node1.next = merge(node1.next, node2);
            return node1;
        }
        else {
            node2.next = merge(node1, node2.next);
            return node2;
        }
    }
}
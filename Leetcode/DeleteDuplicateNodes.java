/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> set = new HashSet<Integer>();
        ListNode temp = head;
        ListNode prev = null;
        
        while (temp != null) {
            if (set.contains(temp.val))
                prev.next = temp.next;
            else {
                set.add(temp.val);
                prev = temp;
            }
            temp = temp.next;
        }
        return head;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        ListNode next;
        
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
        return head;
    }
    
    public void getNum(ListNode head, StringBuilder sb) {
        while (head != null) {
            String data = "" + head.val;
            sb.append(data);
            head = head.next;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        
        StringBuilder term1 = new StringBuilder();
        StringBuilder term2 = new StringBuilder();
        
        getNum(l1, term1);
        getNum(l2, term2);
        
        int sum = Integer.parseInt(term1.toString()) + Integer.parseInt(term2.toString());
        
        String sumString = Integer.toString(sum);
        ListNode head = null;
        for (int i = sumString.length()-1; i >= 0; i--) {
            int data = sumString.charAt(i) - '0';
            ListNode add = new ListNode(data);
            add.next = head;
            head = add;
        }
        return reverse(head);
    }
}
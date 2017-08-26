/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {

    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    private ListNode head;
    private Random rand;
    public Solution(ListNode head) {
        this.head = head;
        rand = new Random();
        
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        int len = 0;
        ListNode temp = head;
        
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        
        int num = rand.nextInt(len);
        temp = head;
        for (int i = 0; i < num; i++)
            temp = temp.next;
        
        return temp.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
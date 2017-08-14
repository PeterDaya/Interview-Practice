/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null)
            return null;
        
        HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        RandomListNode space = new RandomListNode(0);
        RandomListNode newCur = space;
        RandomListNode cur = head;
        
        while (cur != null) {
            if (!map.containsKey(cur))
                map.put(cur, new RandomListNode(cur.label));
            
            if (cur.random != null && !map.containsKey(cur.random))
                map.put(cur.random, new RandomListNode(cur.random.label));
            
            newCur.next = map.get(cur);
            newCur.next.random = map.get(cur.random);
            newCur = newCur.next;
            cur = cur.next;
        }
        return space.next;
    }
}
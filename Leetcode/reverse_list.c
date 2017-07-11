/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
    struct ListNode *prev = NULL;
    struct ListNode *cur = head;
    struct ListNode *nxt;
    
    while (cur) {
        nxt = cur->next;
        cur->next = prev;
        prev = cur;
        cur  = nxt;
    }
    head = prev;
    
    return head;
}
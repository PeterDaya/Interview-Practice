/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method. 
    Node temp = head;
    if (position == 0) {
        temp = new Node();
        temp.next = head;
        temp.data = data;
        return temp;
    }
    
    else {
        while (--position > 0)
            temp = temp.next;
        
        Node ref = temp.next;
        temp.next = new Node();
        temp.next.data = data;
        temp.next.next = ref;
    }
    return head;
}

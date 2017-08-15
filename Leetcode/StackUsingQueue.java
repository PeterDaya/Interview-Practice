public class MyStack {

    /** Initialize your data structure here. */
    private Queue<Integer> myqueue;
    
    public MyStack() {
        myqueue = new LinkedList<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        Queue q = new LinkedList();
        q.add(x);
        
        while (!myqueue.isEmpty())
            q.add(myqueue.remove());
        
        myqueue = q;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return myqueue.remove();
    }
    
    /** Get the top element. */
    public int top() {
        return (int)myqueue.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return myqueue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
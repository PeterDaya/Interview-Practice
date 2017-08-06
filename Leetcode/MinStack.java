public class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> mystack ;
    Stack<Integer> minstack;
    
    public MinStack() {
        mystack = new Stack<Integer>();
        minstack = new Stack<Integer>();
    }
    
    public void push(int x) {
        mystack.push(x);
        
        if (minstack.isEmpty() || x < minstack.peek())
            minstack.push(x);
    }
    
    public void pop() {
        if (mystack.isEmpty())
            return;
        if (mystack.pop() == minstack.peek())
            minstack.pop();
        
    }
    
    public int top() {
        if (mystack.isEmpty())
            return -1;
        return mystack.peek();
    }
    
    public int getMin() {
        if (minstack.isEmpty())
            return -1;
        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
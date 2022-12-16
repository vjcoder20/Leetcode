class MyQueue {
    Stack<Integer> st1;
    Stack<Integer> st2;
    int front;
    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
        front = -1;
    }
    
    public void push(int x) {
        if(st1.empty())
            front = x;
        st1.push(x);
    }
    
    public int pop() {
        if(st2.size()==0){
        while(st1.size()>0)
            st2.push(st1.pop());
        }
        
        return st2.pop();
    }
    
    public int peek() {
        if(st2.size()>0)
            return st2.peek();
        return front;
    }
    
    public boolean empty() {
        return st1.size()==0 && st2.size()==0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
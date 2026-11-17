class MinStack {
    Stack<Integer> st1;
    Stack<Integer> st2;
    public MinStack() {
        st1=new Stack<>();
        st2=new Stack<>();
    }
    
    public void push(int value) {
        if(st2.empty()){
            st2.push(value);
        }
        else if(value<=st2.peek()){
            st2.push(value); 
        }
        st1.push(value);
    }
    
    public void pop() {
        if(!st1.empty() && !st2.empty()){
            if(st1.peek().equals(st2.peek())){
                st2.pop();
            }
            st1.pop();
        }
        
    }
    
    public int top() {
        return (!st1.empty())? st1.peek():0;
    }
    
    public int getMin() {
        if(!st2.empty()){
             return st2.peek();
        }
        return 0;
       
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
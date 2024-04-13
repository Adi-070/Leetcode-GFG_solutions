class MinStack {

    
     Stack<Integer> stack;
     Stack<Integer> stk;
   
    public MinStack() {
        stack = new Stack<>();
        stk = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);

        if(stk.isEmpty() || val<= stk.peek())
        stk.push(val);
            }
    
    public void pop() {
        int var = stack.pop();
        if(var==stk.peek())
        stk.pop();
    }
    
    public int top() {
        return (stack.peek());
    }
    
    public int getMin() {
        return stk.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
..............................................................................

class MinStack {

    static class Pair
    {   int a;
        int b;
        Pair(int a, int b)
        {
        this.a=a;
        this.b=b;
        }
    }
    Stack<Pair> stk ;

    public MinStack() {
        stk = new Stack<>();
    }
    
    public void push(int val) {
        int min=Integer.MAX_VALUE;
        if(stk.isEmpty())
        min = val;

        else
        min = Math.min(stk.peek().b, val);

        stk.push(new Pair(val,min));

    }
    
    public void pop() {
        stk.pop();
    }
    
    public int top() {
        return stk.peek().a;
    }
    
    public int getMin() {
        return stk.peek().b;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

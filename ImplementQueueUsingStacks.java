class MyQueue {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    int item;

    public MyQueue() {
        System.out.println(item);
    }
    
    public void push(int item) {
        s1.push(item);
    }
    
    public int pop() {

        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }
        int removed = s2.pop();
        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }
    return removed;
    }
    
    public int peek() {
        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }
        int peeked = s2.peek();
        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }
    return peeked;
    }
    
    public boolean empty() {
        return s1.isEmpty();
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

class CustomStack {

    ArrayList<Integer> list = new ArrayList<>();
    int n;
    public CustomStack(int maxSize) {
        n=maxSize;
    }
    
    public void push(int x) {

        if(list.size()<n)
        list.add(x);
    }
    
    public int pop() {
        
        if(list.size()==0)
        return -1;

        return list.remove(list.size()-1);
    }
    
    public void increment(int k, int val) {
        
        
        for(int i=0; i<k && i<list.size(); i++)
        list.set(i, list.get(i)+val);
        
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */

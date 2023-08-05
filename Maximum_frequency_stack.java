class FreqStack {

static class Element {
    int val;
    int freq;
    int seq;

    Element(int val, int freq, int seq)
    {
        this.val=val;
        this.freq=freq;
        this.seq=seq;
    }
}
    PriorityQueue<Element> pq; 
    int i;
    HashMap<Integer,Integer> map;

    public FreqStack() {
        pq = new PriorityQueue<>((a,b) -> {

            if(a.freq!=b.freq)
            return b.freq-a.freq;

            else
            return b.seq-a.seq;
        });

        map = new HashMap<>();
        i=0;
    }
    
    public void push(int val) {
        map.put(val,map.getOrDefault(val,0)+1);
        pq.offer(new Element(val,map.get(val),i++));
    }
    
    public int pop() {
        int x = pq.remove().val;
        map.put(x,map.get(x)-1);
        return x;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */

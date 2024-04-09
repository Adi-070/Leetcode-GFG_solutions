class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int c=0;

        for(int i=0; i<tickets.length; i++)
        {
            if(i<=k)
            c += Math.min(tickets[i],tickets[k]);
            
            else
            c += Math.min(tickets[i],tickets[k]-1);
        }
        return c;
    }
}
...................................................................

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        int c=0;

        for(int i=0; i<tickets.length; i++)
        q.add(i);

        while(!q.isEmpty())
        {
            int front = q.remove();
            tickets[front]--;

            c++;

            if(tickets[front]==0 && front==k)
            break;

            if(tickets[front]>0)
            q.add(front);

            else
            continue;
        }
        return c;
    }
}

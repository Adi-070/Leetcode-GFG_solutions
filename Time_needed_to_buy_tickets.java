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

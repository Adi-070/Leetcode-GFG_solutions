class Solution {
    public int maximumProduct(int[] nums) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b-a);
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();

        for(int i:nums)
        {
            pq.add(i);
            pq2.add(i);
        };
       int max1 = pq.poll();
       int max2 = pq.poll();
       int max3 = pq.poll();
    
       int min1 = pq2.poll();
       int min2 = pq2.poll();

        return Math.max(max1*max2*max3, max1*min1*min2);
       
    }
}

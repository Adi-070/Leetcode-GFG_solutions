class Solution {
    public long findScore(int[] nums) {

        int n = nums.length;
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> {

            if(a[0]==b[0])
            return a[1]-b[1];

            else
            return a[0]-b[0];
        });

        boolean arr[] = new boolean[nums.length];

        Arrays.fill(arr,false);

        for(int i=0; i<nums.length; i++)
        pq.offer(new int[]{nums[i],i});

        long score=0;

        while(!pq.isEmpty())
        {
            int[] index = pq.poll();

            int ind = index[1];

            if(arr[ind]==false)
            {
                arr[ind]=true;
                score += index[0];

                if(ind+1<n)
                arr[ind+1]=true;

                if(ind-1>=0)
                arr[ind-1]=true;
            }
        }
        return score;
    }
}

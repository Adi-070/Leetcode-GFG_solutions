class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int low=1;
        int high=1000000000;
        
        int ans=0;

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(possible(piles,mid,h))
            {
                ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean possible(int[] piles, int mid, int h)
    {

        long sum=0;

        for(int i:piles) 
        sum += (i+mid-1)/mid;

        if(sum>h)
        return false;

        return true;

    }
}

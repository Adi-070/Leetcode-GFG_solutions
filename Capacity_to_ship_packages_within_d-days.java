class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int max=1;
        int sum=0;

        for(int weight: weights)
        {
            max=Math.max(weight,max);
            sum += weight;
        }

        int low=max;
        int high=sum;

        int ans=0;

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(possible(weights,mid,days))
            {
                ans=mid;
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return ans;
    }
    public boolean possible(int[] weights, int mincap, int days)
    {
        int day=1;
        int weight=0;

        for(int i=0; i<weights.length; i++)
        {
            if(weights[i]>mincap)
            return false;

            weight += weights[i];

            if(weight>mincap)
            {
                day++;
                weight=weights[i];
            }
        }
        if(day>days)
        return false;


        return true;
    }
}

class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < bloomDay.length; i++) {
            min = Math.min(min, bloomDay[i]);
            max = Math.max(max, bloomDay[i]);
        }

        // for(int i=min; i<=max; i++)
        // {
        //     if (possible(bloomDay,i,m,k))
        //     return i;
        // }
        int low=min;
        int high=max;

        int ans=-1;

        while(low<=high)
        {
            int mid=low+(high-low)/2;
            

            if(possible(bloomDay,mid,m,k))
            {
                ans=mid;
                high=mid-1;
            }
            else 
            low=mid+1;

        }
        return ans;
    }
    public boolean possible(int[] arr, int day, int m, int k)
    {
        if(m*k > arr.length)
        return false;

        int count=0;
        int minb=0;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<=day)
            count++;

            else {
                minb += (count/k);
                count=0;
            }
        }
         minb += (count/k);

         if(minb>=m)
         return true;

         return false;
    }
}

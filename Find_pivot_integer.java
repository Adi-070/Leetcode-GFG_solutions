class Solution {
    public int pivotInteger(int n) {
        int low=1;
        int high=n;

        while(low<=high)
        {
            int mid = low+(high-low)/2;

            if(sum(mid,n)==sum(1,mid))
            {
                return mid;
            }
            else if(sum(1,mid)>sum(mid,n))
            high=mid-1;

            else
            low=mid+1;
        }
        return -1;
    }
    public int sum(int mid, int n)
    {  
        int total=0;

        for(int i=mid; i<=n; i++)
        total += i;

        return total;

    }
}

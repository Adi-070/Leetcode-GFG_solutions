class Solution {
    public int maximumTastiness(int[] price, int k) {
        
        Arrays.sort(price);

        int low=1;
        int high=1000000000;

        int ans=0;

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(check(mid,price,k)==true)
            {
                ans=mid;
                low=mid+1;
            }
            else
            high=mid-1;
        }
        return ans;
    }
    public boolean check(int mid, int[] price, int k){
        int last = price[0];

        int count=1;
        for(int i=1; i<price.length; i++)
        {
            if(price[i]-last>=mid)
            {
                last=price[i];
                count++;
            }
        }
        if(count>=k)
        return true;

        return false;
    }
}

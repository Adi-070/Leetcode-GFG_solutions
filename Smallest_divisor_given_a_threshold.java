class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        
        int low=1;
        int high=0;

       for(int num : nums) 
       high = Math.max(num,high);

        int ans=0;

        while(low<=high)
        {   
            long sum=0;
            int mid=low+(high-low)/2;

            for(int i:nums)
            sum += (i+mid-1)/mid;

            if(sum<=threshold) {
            ans=mid;
            high=mid-1;
            }
            else
            low=mid+1;  
        }
        return ans;
    }
}

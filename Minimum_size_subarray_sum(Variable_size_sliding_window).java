class Solution {
    public int minSubArrayLen(int k, int[] nums) {
        int i=0;
        int j=0;

        int min=Integer.MAX_VALUE;
        int sum=0;

        while(j<nums.length)
        {
            sum += nums[j];

            if(sum<k)
            j++;

            else if(sum==k)
            {
            min=Math.min(min,j-i+1);
            j++;
            }

            else if(sum>k)
            {
                while(sum>k)
                {  
                    min=Math.min(min,j-i+1);
                    sum -= nums[i];
                    i++;
                }

                if(sum==k)
                min=Math.min(min,j-i+1);

                j++;
            }
        }
        if(min==Integer.MAX_VALUE)
        return 0;

        return min;
    }
}

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int i=0;
        int j=0;

        int min=Integer.MAX_VALUE;

        int sum=0;

        while(j<nums.length)
        {
            sum += nums[j];


            if(sum<target)
            j++;

            else if(sum>=target)
            {
                while(sum>=target)
                {
                    min=Math.min(min,j-i+1);
                    sum -= nums[i];
                    i++;
                }
                j++;
            }
        }
        if(min==Integer.MAX_VALUE)
        return 0;

        return min;
    }
}
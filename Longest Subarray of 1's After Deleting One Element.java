class Solution {
    public int longestSubarray(int[] nums) {
        int i=0;
       

        int zero=0;
        int max=0;

        for(int j=0; j<nums.length; j++)
        {
            if(nums[j]==0)
            zero++;

                while(zero>1)
                {
                    if(nums[i]==0)
                    {
                        zero--;
                    }
                    
                        i++;
                    
                }
            
            max=Math.max(max,j-i);
            

        }
        return max;
    }
}

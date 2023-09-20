class Solution {
    public int minOperations(int[] nums, int x) {
        
        int sum=0;

        for(int i:nums)
        sum +=i;

        int needed_sum = sum-x;

        int i=0;
        int j=0;
        int max=-1;

        int s=0;

        while(j<nums.length)
        {
            s += nums[j];

            // if(s<needed_sum)
            // j++;

            if(s>needed_sum)
            {
                while(s>needed_sum && i<=j)
                { 
                    s -= nums[i];

                    i++;
                }
                
            }

             if(s==needed_sum) 
             max = Math.max(max,j-i+1);
            
             j++;
        }
        if(max==-1)
        return max;


        return nums.length-max;

    }
}

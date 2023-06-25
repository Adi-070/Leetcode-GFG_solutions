class Solution {
    public int maxProduct(int[] nums) {
        
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]>max)
            {
            max2=max;
            max=nums[i];
            }
            else if(nums[i]>max2)
            max2=nums[i];
        }
        System.out.println(max);
        System.out.println(max2);

        return (max-1)*(max2-1);
    }
}

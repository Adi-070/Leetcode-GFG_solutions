class Solution {
    public int triangleNumber(int[] nums) {
        
        Arrays.sort(nums);

        
        int high=nums.length-1;

        int c=0;

        while(high>1)
        {   int i=0;
            int j=high-1;
        while(i<j) {
            if(nums[i]+nums[j]>nums[high])
            {
                c+=j-i;
                j--;
            }
            else
            i++;
        } 
            high--;
        }
        return c;
    }
}

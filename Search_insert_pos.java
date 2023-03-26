class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = -1;
        for(int i =0; i<nums.length; i++)
        { 
         
            if (target>nums[i])
            index++;

            else
            {
                index=i;
                break;
            }
        }
            if(target>nums[nums.length-1])
            index++;
        
        return index;
    }
}

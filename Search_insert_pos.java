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

...........................................................................
    
class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int low=0;
        int high=nums.length-1;

        int ans = nums.length;

        while(low<=high)
        {
            int mid = low + (high-low)/2;

            if(nums[mid]>=target)
            {   
                ans=mid;
                high=mid-1;
            }
            else if(nums[mid]<target)
            {
                low=mid+1;
            }
        }
        return ans;
    }
}

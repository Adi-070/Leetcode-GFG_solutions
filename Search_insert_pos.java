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
        int low = 0, high = nums.length-1;

        

        while(low<=high)
        {   int mid=(low+high)/2;
            if (target==nums[mid])
            return mid;

            else if(target<nums[mid])
            high=mid-1;

            else 
            low=mid+1;
        }
        return low;
    }
    
}

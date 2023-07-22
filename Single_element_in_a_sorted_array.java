class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int low =0;
        int high = nums.length-1;

        int mid=0;

        while(low<=high)
        {
             mid = low + (high-low)/2;

            int num = mid+1;

            if(num%2==0) {

                if(mid>0 && nums[mid]==nums[mid-1])
                low=mid+1;

                else if(mid<nums.length-1 && nums[mid]==nums[mid+1])
                high=mid-1;

                 else 
                  return nums[mid];
            }

            else if(num%2!=0)
            {
                if(mid>0 && nums[mid]==nums[mid-1])
                high=mid-1;

                else if(mid<nums.length-1 && nums[mid]==nums[mid+1])
                low=mid+1;

                else 
                return nums[mid];
            }
        }
        return nums[mid];
    }
}

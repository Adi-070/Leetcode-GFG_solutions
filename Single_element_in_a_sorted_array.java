class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int n = nums.length; 

    //Edge cases:
    if (n == 1) return nums[0];
    if (nums[0] != nums[1]) return nums[0];
    if (nums[n - 1] != nums[n - 2]) return nums[n - 1];

        int low=0;
        int high=nums.length-1;

        int mid=0;

        while(low<=high)
        {
            mid = low + (high-low)/2;

            if(mid%2==0)
            {
                if(nums[mid]==nums[mid+1])
                low=mid+1;

                else if(nums[mid]==nums[mid-1])
                high=mid-1;

                else
                return nums[mid];
            }
             if(mid%2!=0)
            {
                if(nums[mid]==nums[mid+1])
                high=mid-1;

                else if(nums[mid]==nums[mid-1])
                low=mid+1;

                else
                return nums[mid];
            }
        }
        return nums[mid];
    }
}

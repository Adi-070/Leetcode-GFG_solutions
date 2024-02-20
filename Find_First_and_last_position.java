class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i: nums)
        map.put(i,map.getOrDefault(i,0)+1);                    //BRUTE FORCE

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==target)
            return new int[]{i,i+map.get(nums[i])-1};
        }
        return new int[]{-1,-1};
    }
}

...............................................................................................

class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int res[] = {-1,-1};

        int first = first(nums,target);
        int last = last(nums,target);

        res[0]=first;
        res[1]=last;

        return res;
    }
    public int first(int[] nums, int target)
    {
        int low=0;
        int high=nums.length-1;

        int res=-1;

        while(low<=high)
        {   int mid = low + (high-low)/2;
            if(nums[mid]<target)
            {
                low=mid+1;
            }
            else if(nums[mid]>target)
            {
                high=mid-1;
            }
            else {
                res=mid;
                high=mid-1;
            }
        }
        return res;
    }
    public int last(int[] nums, int target)
    {
        int low=0;
        int high=nums.length-1;

        int res=-1;

        while(low<=high)
        {   int mid = low + (high-low)/2;
            if(nums[mid]<target)
            {                                                                                //OPTIMAL
                low=mid+1;
            }
            else if(nums[mid]>target)
            {
                high=mid-1;
            }
            else {
                res=mid;
                low=mid+1;
            }
        }
        return res;
    }
}

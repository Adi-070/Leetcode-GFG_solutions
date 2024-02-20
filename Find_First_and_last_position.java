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

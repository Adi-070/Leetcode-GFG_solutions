class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return count(nums,goal)-count(nums,goal-1);
    }
    public int count(int[] nums, int goal)
    {
        int i=0;
        int j=0;

        int sum=0;
        int c=0;

        if(goal<0)
        return 0;

        while(j<nums.length)
        {
            sum += nums[j];

                while(sum>goal)
                {
                    sum -= nums[i];
                    i++;
                }

                 c+=(j-i+1);

                j++;          
        }
        return c;
    }
}
...................................................................................................................
    
    
    class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        HashMap<Integer,Integer> map = new HashMap<>();

        int sum=0;
        int c=0;

        map.put(0,1);

        for(int i:nums)
        {   
            sum +=  i;

            if(map.containsKey(sum-goal))
            c += map.get(sum-goal);

            map.put(sum,map.getOrDefault(sum,0)+1);

        }
        return c;
    }
}

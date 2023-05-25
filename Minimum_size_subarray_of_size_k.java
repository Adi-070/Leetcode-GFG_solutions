class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int min=Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++)
        {   
            sum += nums[i];

            if(!map.containsKey(sum))
            map.put(sum,i);
                                                                                                // BRUTE_FORCE
            if(map.containsKey(sum-target))
            min = Math.min(min,i-map.get(sum-target));

            if(sum==target)
            min=Math.min(min,i+1);
        }
        if(min==Integer.MAX_VALUE)
        return 0;

        return min;

        
    }
}

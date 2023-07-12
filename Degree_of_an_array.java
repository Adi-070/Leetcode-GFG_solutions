class Solution {
    public int findShortestSubArray(int[] nums) {
        
        HashMap<Integer,Integer> left = new HashMap<>();
        HashMap<Integer,Integer> right = new HashMap<>();
        HashMap<Integer,Integer> count = new HashMap<>();

        int degree = Integer.MIN_VALUE;
        int MinLength = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++)
        {
            if(left.get(nums[i])==null)
            left.put(nums[i],i);

            right.put(nums[i],i);

            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
        }

        for(int i: count.keySet())
        degree = Math.max(degree, count.get(i));

        for(int i: count.keySet())
        {
            if(count.get(i)==degree)
            MinLength = Math.min(MinLength, right.get(i)-left.get(i)+1);
        }
        return MinLength;
    }
}

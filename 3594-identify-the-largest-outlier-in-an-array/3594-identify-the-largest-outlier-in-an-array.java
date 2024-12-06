class Solution {
    public int getLargestOutlier(int[] nums) {
       
        
       HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0; 

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);;
        } 

        int largestOutlier=Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++)
        {
            int s= sum-nums[i];

            if(s%2==0 && map.containsKey(s/2))
            {
                if(s/2 != nums[i] || map.get(s/2)>1)
                largestOutlier=Math.max(largestOutlier, nums[i]);
            }
        }
        return largestOutlier;
    }

  
}
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i+=2)
        {
            if(nums[i]!=nums[i+1])
            {
                return nums[i];
            }
        }
    return nums[nums.length-1];
    }
}
.................................................................
    
    class Solution {
    public int singleNumber(int[] nums) {
 HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){

            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
         for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==1)
            return nums[i];
         }
        
        return -1;
    }
}

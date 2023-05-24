class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

       for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) nums[i] = -1;
        }

        int sum=0;
        int max=0;

        for(int i=0; i<nums.length; i++)
        {
            sum += nums[i];

            if(map.containsKey(sum))
            max = Math.max(max,i-map.get(sum));

            else
            map.put(sum,i);

            if(sum==0)
            max=Math.max(max,i+1);
        }
        return max;
    }
}

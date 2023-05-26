class Solution {
    public int minimumDifference(int[] nums, int k) {
        int i=0;
        int j=0;

        int min = Integer.MAX_VALUE;

        while(j<nums.length)
        {
            Arrays.sort(nums);

            if(j-i+1<k)
            j++;

            if(j-i+1==k)
            {
                min=Math.min(min,nums[j]-nums[i]);

                i++;
                j++;
            }
        }
        return min;
    }
}

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double average=0;
        double sum=0;
        double max = Integer.MIN_VALUE;

        int i=0;
        int j=0;

        while(j<nums.length)
        {
            sum += nums[j];

            if(j-i+1<k)
            j++;

            else if(j-i+1==k)
            {
            average=sum/k;
            max=Math.max(max,average);

            sum -= nums[i];
            i++;
            j++;
            }
        }
        return max;
    }
}

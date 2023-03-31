class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a =-1, b=-1;
        for(int i=0;i<nums.length;i++)
        {
            if (target==nums[i]) {
            a = i;
            break;
            }
        }
         for(int j=nums.length-1;j>=0;j--)
        {
            if (target==nums[j]) {
            b = j;
            break;
            }
        }
        int d[] = new int[2];
        for(int k =0;k<2;k++)
        {
            d[0] = a;
            d[1] = b;
        }
        return d;
    }
}

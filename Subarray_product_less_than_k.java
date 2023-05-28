class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
       int i=0;
       int j=0;

       int c=0;
       int p=1;

       if(k<=1)
       return 0;

       while(j<nums.length)
       {
           p = p*nums[j];

            if(p>=k)
           {
               while(p>=k)
               {
                   p = p/nums[i];
                   i++;
               }
           }
            c += (j-i+1);
            j++;
       } 
       return c;
    }
}

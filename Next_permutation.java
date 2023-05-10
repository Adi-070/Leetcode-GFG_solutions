class Solution {
    public void nextPermutation(int[] nums) {
        
        int idx1=-1;
        int idx2=-1;

        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                idx1=i;
                break;
            }
        }
        if(idx1==-1)
        reverse(nums,0);
else {
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[idx1]<nums[i])
            {
                idx2=i;
                break;
            }
        }
        swap(nums,idx1,idx2);
        reverse(nums,idx1+1);
}
    }
    public void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void reverse(int[] nums, int start)
    {
      int  i=start;
        int j=nums.length-1;
    while(i<j)
    {
        swap(nums,i,j);
        i++;
        j--;
    }
    }
}

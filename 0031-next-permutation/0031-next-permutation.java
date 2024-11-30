class Solution {
    public void nextPermutation(int[] nums) {
        int idx1=-1;
        int idx2=-1;

        for(int i=nums.length-2; i>=0; i--)
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
            for(int i=nums.length-1; i>=0; i--)
            {
                if(nums[i]>nums[idx1]){
                   idx2=i;
                   break;
                }
               
            }
        swap(nums,idx1,idx2);
        reverse(nums, idx1+1);
        }  
    }

        public void swap(int nums[], int idx1, int idx2)
        {
            int temp=nums[idx1];
            nums[idx1]=nums[idx2];
            nums[idx2]=temp;
        }
        public void reverse(int nums[], int start)
        {
            int i=start;
            int j=nums.length-1;

            while(i<j)
            {
               swap(nums,i,j);
               i++;
               j--; 
            }
        }
}
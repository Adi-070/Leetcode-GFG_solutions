class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        int[] arr = new int[nums.length];

        int index=0;

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]<pivot)
            arr[index++]=nums[i];
        }
         for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==pivot)                                                                    T.C- O(3n)
            arr[index++]=nums[i];                                                                 S.C- O(1)
        }
         for(int i=0; i<nums.length; i++)
        {
            if(nums[i]>pivot)
            arr[index++]=nums[i];
        }
    return arr;
    }
}
........................................................................

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        for(int i=0; i<nums.length; i++)
        {                                                                                            T.C- O(n^2)
            if(nums[i]<pivot)                                                                        S.C- O(1)
            {
                for(int j=i; j>0 && nums[j-1]>=pivot; j--)
                {
                    int temp=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==pivot)
            {
                for(int j=i; j>0 && nums[j-1]>pivot; j--)
                {
                    int temp=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }
}

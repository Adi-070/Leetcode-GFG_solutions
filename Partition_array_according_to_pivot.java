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
            if(nums[i]==pivot)
            arr[index++]=nums[i];
        }
         for(int i=0; i<nums.length; i++)
        {
            if(nums[i]>pivot)
            arr[index++]=nums[i];
        }
    return arr;
    }
}

class Solution {
    public void sortColors(int[] nums) {
          int n = nums.length;  
        int temp = 0;  
         for(int i=0; i < n-1; i++){  
                 for(int j=i+1; j < n; j++){  
                          if(nums[i] > nums[j]){  
                                 
                                 temp = nums[i];  
                                 nums[i] = nums[j];  
                                 nums[j] = temp;  
                         }  
                          
                 }  
         }  
    }
}
...................................................................

class Solution {
    public void sortColors(int[] nums) {
        int index=0;
        int zero=0;
        int one=0;
        int two=0;

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==0)
            zero++;

            else if(nums[i]==1)
            one++;

            else if(nums[i]==2)
            two++;
        }
        for(int i=0; i<zero; i++)
        nums[index++]=0;

        for(int i=0; i<one; i++)
        nums[index++]=1;

        for(int i=0; i<two; i++)
        nums[index++]=2;

       
    }
}

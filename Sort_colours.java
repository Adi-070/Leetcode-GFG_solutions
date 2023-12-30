class Solution {
    public void sortColors(int[] nums) {
        int low=0,mid=0, high=nums.length-1;

        while(mid<=high)
        {
            if(nums[mid]==0) {
            //swap(nums[low],nums[mid]);
            int temp=nums[low];
            nums[low]=nums[mid];
            nums[mid]=temp;
            low++;
            mid++;                                        //Dutch National Flag algorithm 
            }

            else if(nums[mid]==1)
            mid++;

            else {
            // swap(nums[mid],nums[high]);
            int temp=nums[mid];
            nums[mid]=nums[high];
            nums[high]=temp;
            high--;
            }
        }
    }
    public void swap(int a, int b)
    {   int temp;
        temp=a;
        a=b;
        b=temp;
    }
}
...........................................................................................
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
.........................................................................................

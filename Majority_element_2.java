class Solution {
    public List<Integer> majorityElement(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        int nums1 = Integer.MIN_VALUE;
        int nums2 = Integer.MIN_VALUE;

        int count1=0;
        int count2=0;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==nums1)
            {
                count1++;
            }
            else if(arr[i]==nums2)
            {
                count2++;
            }
            else if(count1==0)
            {
                nums1=arr[i];
                count1=1;
            }
            else if(count2==0)
            {
                nums2=arr[i];
                count2=1;
            }
            else
            {
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==nums1)
            count1++;

            if(arr[i]==nums2)
            count2++;
        }
        if(count1 > arr.length/3)
        list.add(nums1);

        if(count2>arr.length/3)
        list.add(nums2);

        return list;
    }

}
...........................................................................


class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int num1=Integer.MIN_VALUE;
        int num2=Integer.MIN_VALUE;

        int count1=0;
        int count2=0;

        for(int i=0; i<nums.length; i++)
        {
            if(count1==0 && nums[i]!=num2)
            {
                num1=nums[i];
                count1=1;
            }
            else if(count2==0 && nums[i]!=num1)
            {
                num2=nums[i];
                count2=1;
            }
            else if(nums[i]==num1)
            count1++;

            else if(nums[i]==num2)
            count2++;

            else {
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==num1)
            count1++;

            if(nums[i]==num2)
            count2++;
        }

        if(count1 > n/3)
        list.add(num1);

        if(count2 > n/3)
        list.add(num2);

        return list;
    }
}

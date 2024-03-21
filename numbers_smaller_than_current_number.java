class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        ArrayList<Integer> list = new ArrayList<>();

        for(int i:nums)
        list.add(i);

        Collections.sort(list);

        for(int i=0; i<nums.length; i++)
        nums[i]=list.indexOf(nums[i]);

        return nums;
    }
}

...........................................................

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] arr = new int[nums.length];

        int c=0;
        int index=0;

        for(int i=0; i<nums.length; i++)
        {
            for(int j=0; j<nums.length; j++)
            {
                if(nums[j]<nums[i])
                c++;
            }
        arr[index++]=c;
        c=0;
        }
        return arr;
    }
}

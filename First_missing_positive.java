class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        boolean flag=false;

        // for(int i=0; i<nums.length; i++)
        // {
        //     if(nums.length==1)
        //     return nums.length+1;
        // }

        for(int i:nums)
        set.add(i);



        int i=1;

        while(i<=nums.length)
        {
            if(!set.contains(i))
            {
            flag=true;
            break;
            }
            i++;
        }
        if(!flag)
        return nums.length+1;
        
        return i;
    }
}

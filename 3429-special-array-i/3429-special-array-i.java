class Solution {
    public boolean isArraySpecial(int[] nums) {
        boolean flag=true;

        for(int i=0; i<nums.length-1; i++)
        {
           if ((parity(nums[i]) == 1) && (parity(nums[i + 1]) == 1)) {
    flag = false;
}

if ((parity(nums[i]) == 0) && (parity(nums[i + 1]) == 0)) {
    flag = false;
}

        }
return flag;
    }
    public int parity(int n)
    {
        return n%2;
    }
}
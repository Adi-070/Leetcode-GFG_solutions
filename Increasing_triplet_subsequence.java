class Solution {
    public boolean increasingTriplet(int[] nums) {
        int min=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;

        for(int i:nums)
        {
            if(i<=min)
            min=i;

            else if(i<min2)
            min2=i;

            else if(i>min2)
            return true;
        }
        return false;
    }
}

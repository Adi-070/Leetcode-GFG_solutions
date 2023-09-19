class Solution {
    public int countWays(List<Integer> nums) {
       
        Collections.sort(nums);

        int nss = 0;
        int ways = 0;

        for(int i=0; i<nums.size(); i++)
        {
            if(i==0  && nums.get(i)>nss)
            ways++;

            if(i>0 && nums.get(i)>nss && nums.get(i-1)<nss)
            ways++;

            nss++;
        }

        if(nums.get(nums.size()-1)<nss)
        ways++;

        return ways;
    }
}

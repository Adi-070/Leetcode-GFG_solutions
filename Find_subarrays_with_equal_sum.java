class Solution {
    public boolean findSubarrays(int[] nums) {
        
        int i=0;
        int j=0;

        int sum=0;

        HashMap<Integer,Integer> map = new HashMap<>();

        while(j<nums.length)
        {
            sum += nums[j];

            if(j-i+1<2)
            j++;

            else if(j-i+1==2)
            {   

                if(map.containsKey(sum))
                return true;

                map.put(sum,map.getOrDefault(sum,0)+1);

                sum -= nums[i];
            i++;
            j++;
            }
        }
        return false;
    }
}

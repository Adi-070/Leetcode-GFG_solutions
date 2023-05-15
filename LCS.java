class Solution {
    public int longestConsecutive(int[] nums) {
       
        HashSet<Integer> set = new HashSet<>();

        int max=0;

        for(int i:nums)
        {
            set.add(i);
        }

        for(int i:nums)
        {
            if(!set.contains(i-1))
            {
                int count=1;
                int val = i;

                while(set.contains(val+1))
                {
                    count++;
                    val++;
                }

                max = Math.max(max,count);
            }
        }
        return max;
    }
}

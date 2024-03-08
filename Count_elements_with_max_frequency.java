class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        int max=Integer.MIN_VALUE;

        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);                                              //  TC-O(2n)
                                                                                            //   SC=O(n)
            max=Math.max(max,map.get(i));
        }
       
        int c=0;
        for(int i:map.keySet())
        {
            if(map.get(i)==max)
            c+=map.get(i);
        }
        return c;
    }
}

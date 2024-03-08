class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=Integer.MIN_VALUE;

        for(int i:map.keySet())
        {
            if(map.get(i)>max)
            max=map.get(i);
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

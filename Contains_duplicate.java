class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i:nums)
        {
            if(set.contains(i))
            return true;

            set.add(i);
        }
        return false;
    }
}
.........................................
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int i:nums)
        {
            if(map.get(i)>1)
            return true;
        }
        return false;
    }
}

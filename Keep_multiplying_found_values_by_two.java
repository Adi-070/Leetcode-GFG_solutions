class Solution {
    public int findFinalValue(int[] nums, int original) {
        
        HashSet<Integer> set = new HashSet<>();

        for(int i:nums)
        set.add(i);

        if(!set.contains(original))
        return original;


        if(set.contains(original))
        return findFinalValue(nums,original*2);

        return 0;

    }
}

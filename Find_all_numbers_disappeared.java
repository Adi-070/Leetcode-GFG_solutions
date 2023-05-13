class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i:nums)
        set.add(i);

        for(int i=1; i<=nums.length; i++)
        {
            if(!set.contains(i))
            list.add(i);
        }
        return list;
    }
}

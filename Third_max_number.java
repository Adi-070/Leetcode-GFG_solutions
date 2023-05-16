class Solution {
    public int thirdMax(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i:nums)
        set.add(i);

        list.addAll(set);

        Collections.sort(list);
        Collections.reverse(list);

        if(list.size()==2)
        return list.get(0);

        if(list.size()==1)
        return list.get(0);

        return list.get(2);
    }
}

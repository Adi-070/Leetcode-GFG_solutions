class Solution {
    public int distributeCandies(int[] candyType) {
        
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i: candyType)
        list.add(i);

        for(int j:list)
        set.add(j);

        return Math.min(set.size(),candyType.length/2);
    }
}

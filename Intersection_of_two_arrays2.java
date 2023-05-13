class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> intersection = new ArrayList<>();

        

        for(int i:nums1)
        list.add(i);

        for(int i:nums2)
        {
            if(list.contains(i))
            {
            intersection.add(i);
            int x  = list.indexOf(i);
            list.remove(x);
            }
        }

        int ans[] = new int[intersection.size()];

        for(int i=0; i<ans.length; i++)
        {
            ans[i]=intersection.get(i);
        }
        return ans;
    }
}

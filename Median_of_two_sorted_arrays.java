class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> list = new ArrayList<>();

        for(int i:nums1)
        list.add(i);

        for(int i:nums2)
        list.add(i);

        Collections.sort(list);

        int n=list.size();

        if(n%2!=0)
        return list.get(n/2);

        double ans = (list.get(n/2 -1) + list.get(n/2));

        return ans/2;
    }
}

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        for(int i=0; i<nums1.length; i++)
        set1.add(nums1[i]);

        HashSet<Integer> set2 = new HashSet<>();
        for(int i=0; i<nums2.length; i++)
        set2.add(nums2[i]);

        set1.retainAll(set2);

        list.addAll(set1);

        int index=0;

        int[] output = new int[list.size()];

        for(int i=0; i<set1.size(); i++)
        output[index++] = list.get(i);

        return output;
    }
}

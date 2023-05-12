class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];

        HashSet<Integer> set = new HashSet<>();

        for(int i:nums)
        {
            if(set.contains(i))
            arr[0]=i;

            set.add(i);
        }
        for(int i=1; i<=nums.length; i++)
        {
            if(!set.contains(i))
            arr[1]=i;
        }
        return arr;
    }
}

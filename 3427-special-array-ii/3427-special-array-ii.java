class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int[] s= new int[nums.length];
        Arrays.fill(s,0);

        for(int i=1; i<nums.length; i++)
        {
            if((nums[i]%2)!=nums[i-1]%2)
            s[i]=s[i-1];

            else
            s[i]=s[i-1]+1;
        }
        boolean[] result = new boolean[queries.length];
      
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            // Check if start and end belong to the same subarray
            result[i] = (s[start] == s[end]);
        }
        return result;
    }
}
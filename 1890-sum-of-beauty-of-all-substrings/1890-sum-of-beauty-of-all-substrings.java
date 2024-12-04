class Solution {
    public int beautySum(String s) {
        
        int sum=0;

        for(int i=0; i<s.length(); i++)
        {   
            int[] arr = new int[26];

            for(int j=i; j<s.length(); j++)
            {   
                arr[s.charAt(j)- 'a']++;
                sum += helper(arr);
            }
        }
        return sum;
    }
    public int helper(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<26; i++)
        {
            if(arr[i]!=0)
            {
            min=Math.min(min,arr[i]);
            max=Math.max(max,arr[i]);
            }
        }
        return max-min;
    }
}
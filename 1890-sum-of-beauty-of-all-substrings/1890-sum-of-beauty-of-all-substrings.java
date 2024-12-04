class Solution {
    public int beautySum(String s) {
        
        int sum=0;
        

        for(int i=0; i<s.length(); i++)
        {   
            int[] freq = new int[26];
            for(int j=i; j<s.length(); j++)
            {
                freq[s.charAt(j)-'a']++;
                sum += helper(freq);
            }
        }
        return sum;
    }
    public int helper(int[] freq)
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i: freq)
        {
            if(i!=0)
            {
                max=Math.max(max,i);
                min=Math.min(min,i);
            }
        }
        return max-min;
    }
}
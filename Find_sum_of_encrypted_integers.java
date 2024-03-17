class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        
        int sum=0;

        for(int i: nums)
        {
            sum += encrypt(i);
        }
        return sum;
    }
    public int encrypt(int n)
    {   int m=n;
        int max = Integer.MIN_VALUE;
        while(n>0)
        {
            int r=n%10;
            max=Math.max(r,max);
            n=n/10;
        }
        String s="";

        while(m>0)
        {
           s += max;
           m=m/10;
        }
        return Integer.parseInt(s);
    }
}

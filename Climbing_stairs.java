class Solution {
    public int climbStairs(int n) {
        
        int[] dp = new int[n+1];

        if(n<=1)
        return 1;

        dp[0]=1;
        dp[1]=1;
        dp[2]=2;                      //TABULATION
    
        if(n==2)
        return n;

        for(int i=3; i<=n; i++)
        dp[i]=dp[i-1]+dp[i-2];

        return dp[n];

    }
}

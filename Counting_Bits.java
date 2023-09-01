class Solution {
    public int[] countBits(int n) {
        
        int ans[] = new int[n+1];

        for(int i=0; i<=n; i++)
        ans[i]=solve(i,ans);

        return ans;
    }
    public int solve(int n, int dp[]) {

        if(n==0)
        return 0;

        if(n==1)
        return 1;

        if(dp[n]!=0)
        return dp[n];

        if(n%2==0)
        {
            dp[n]=solve(n/2,dp);
            return solve(n/2,dp);
        }
        else {
            dp[n]=1 + solve(n/2,dp);
            return 1 + solve(n/2,dp);
        }
    }
}

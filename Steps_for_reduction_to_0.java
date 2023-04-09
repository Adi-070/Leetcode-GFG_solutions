class Solution {
    public int numberOfSteps(int num) {
       return helper(num, 0);
    }
    public int helper(int n, int steps)
    {
        if (n==0)
        return steps;

        else if(n%2==0)
        return helper(n/2, steps+1);

        return helper(n-1, steps+1);
    }
}

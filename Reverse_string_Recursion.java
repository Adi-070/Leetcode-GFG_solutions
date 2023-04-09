class Solution {

    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;

        solve(s,start,end);
    }

    public void solve(char[] s, int start, int end)
    {
        if(start>end)
        return;

        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        solve(s, ++start , --end);
    }
}

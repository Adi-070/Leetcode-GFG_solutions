class Solution {
    int max = Integer.MIN_VALUE;
    String maxstr = "";
    public String longestPalindrome(String s) {
        
        int i=0;

        while(i<s.length())
        {
            check(i,i+1,s);
            check(i-1,i+1,s);

            i++;
        }
        return maxstr;


    }
    public void check(int i, int j, String s) {
        
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j))
        {
            i--;
            j++;
        }
        if(j-i+1 > max)
        {
            max=j-i+1;
            maxstr= s.substring(i+1,j);
        }
    }
}

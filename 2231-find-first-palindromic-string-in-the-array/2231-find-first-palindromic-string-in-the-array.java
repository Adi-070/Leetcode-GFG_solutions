class Solution {
    public String firstPalindrome(String[] words) {
        
        for(String s: words)
        {
            if (palindrome(s,0,s.length()-1))
            return s;
        }
        return "";
    }
    public boolean palindrome(String s, int left, int right)
    {

        if(left>=right)
        return true;

        if(s.charAt(left)!=s.charAt(right))
        return false;

        return palindrome(s,left+1,right-1);
    }
}
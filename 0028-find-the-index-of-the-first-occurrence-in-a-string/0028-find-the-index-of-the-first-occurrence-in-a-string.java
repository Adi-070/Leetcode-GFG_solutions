class Solution {
    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n=needle.length();

        if(haystack.equals(needle))
        return 0;

        if(h<n)
        return -1;
        for(int i=0; i<=h-n; i++)
        {
            if(haystack.charAt(i)==needle.charAt(0))
            { 

                if(haystack.substring(i,i+n).equals(needle))
                return i;
            }
        }
        return -1;
    }
}
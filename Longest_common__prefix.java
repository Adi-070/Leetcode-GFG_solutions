class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String str1 = strs[0];
        String str2 = strs[strs.length-1];

        int i;

        for(i=0; i<str1.length() && i<str2.length(); i++)
        {
            if(str1.charAt(i)!=str2.charAt(i))
            break;
        }

        return str1.substring(0,i);
    }
}

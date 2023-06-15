class Solution {
    public boolean isPalindrome(String s) {
        //s.toLowerCase();

        StringBuilder str = new StringBuilder();
        //StringBuilder str1 = new StringBuilder();

        for(int i=0; i<s.length(); i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            str.append(s.charAt(i));

        }
        return str.toString().equalsIgnoreCase(str.reverse().toString());
        
        
    }
}

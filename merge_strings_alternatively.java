class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();

        for(int i=0;i< Math.max(word1.length(),word2.length()); i++)
        {
            if (i<word1.length())
            str.append(word1.charAt(i));

            if(i<word2.length())
            str.append(word2.charAt(i));
        }
        return str.toString();
    }
}

class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;

        for(int i=0; i<sentences.length; i++)
        {
            int count=num(sentences[i]);
            max=Math.max(max,count);
        }
        return max;
    }
    public int num(String sentence)
    {   
        int c=1;

        for(int i=0; i<sentence.length(); i++)
        {
            if(sentence.charAt(i)==' ')
            c++;
        }
        return c;
    }
}

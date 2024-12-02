class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        
        String words[] = sentence.split(" ");

        int i;
        for(i=0; i<words.length; i++)
        {
            for(int j=0, k=0; k<searchWord.length() && j<words[i].length(); j++,k++)
            {
                char ch = words[i].charAt(j);
                char c=searchWord.charAt(k);

                if(ch!=c)
                break;

                if(k==searchWord.length()-1)
                return i+1;
            }
        }
        return -1;
    }
}
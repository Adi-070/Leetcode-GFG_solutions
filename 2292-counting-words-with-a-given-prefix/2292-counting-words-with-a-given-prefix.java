class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        int i;
        for(i=0; i<words.length; i++)
        {
            for(int j=0, k=0; k<pref.length() && j<words[i].length(); j++,k++)
            {
                char ch = words[i].charAt(j);
                char c=pref.charAt(k);

                if(ch!=c)
                break;

                if(k==pref.length()-1)
                count++;
            }
        }
        return count;
    }
}
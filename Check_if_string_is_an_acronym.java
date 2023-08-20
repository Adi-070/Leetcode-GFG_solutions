class Solution {
    public boolean isAcronym(List<String> words, String s) {
        
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<words.size(); i++)
        {
            sb.append(words.get(i).charAt(0));
        }

        if(sb.toString().equals(s))
        return true;

        return false;
    }
}

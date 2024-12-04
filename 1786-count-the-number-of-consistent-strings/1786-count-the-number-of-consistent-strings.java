class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        int c=0;
        
        for(String s: words)
        {
            if(helper(allowed,s))
            c++;
        }
        return c;
    }
    public boolean helper(String s, String p)
    {   
        HashSet<Character> set = new HashSet<>();

        for(char c: s.toCharArray())
        set.add(c);

        for(int i=0; i<p.length(); i++)
        {
            if(!set.contains(p.charAt(i)))
            return false;
        }
        return true;
    }
}
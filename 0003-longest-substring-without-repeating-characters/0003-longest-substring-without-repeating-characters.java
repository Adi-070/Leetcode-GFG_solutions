class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;

        int max=0;

        if (s.length()==1)
        return 1;

        HashSet<Character> set = new HashSet<>();

        while(j<s.length())
        {
            if(set.contains(s.charAt(j)))
            {
                max=Math.max(max,set.size());
                set.remove(s.charAt(i++));
            }
            else{
                set.add(s.charAt(j++));
            }
        }
        max=Math.max(max,set.size());
      

        return max;
    }
}
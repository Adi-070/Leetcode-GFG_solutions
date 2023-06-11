class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int i=0;
        int j=0;

        int max=0;

        HashSet<Character> set = new HashSet<>();

        while(j<s.length())
        {
            if(!set.contains(s.charAt(j)))
            {
                set.add(s.charAt(j++));
                max = Math.max(set.size(),max);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }
}

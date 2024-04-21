class Solution {
    public int numberOfSpecialChars(String word) {
        
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();

        for(int i=0; i<word.length();i++)
        {
            char c=word.charAt(i);
            if(Character.isLowerCase(c))
            set1.add(Character.toUpperCase(c));

            else
            set2.add(c);
        }
        HashSet<Character> inter = new HashSet<>(set1);
        
        inter.retainAll(set2);
   

        return inter.size();
    }
}

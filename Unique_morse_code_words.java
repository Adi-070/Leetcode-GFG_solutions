class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        HashSet <String> set = new HashSet<>();

        for(int i=0; i<words.length; i++)
        {   StringBuilder s = new StringBuilder();

            for(char c: words[i].toCharArray())
            {
                s.append(morse[c-'a']);
            }
            set.add(s.toString());
        }
        return set.size();
    }
}

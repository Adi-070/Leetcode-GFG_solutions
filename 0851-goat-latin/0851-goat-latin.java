class Solution {
    public String toGoatLatin(String sentence) {
     StringBuilder sb = new StringBuilder();
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {  // Corrected loop condition
            String s = words[i];

           if(s.charAt(0)=='a'||s.charAt(0)=='e'||s.charAt(0)=='i'||s.charAt(0)=='o'||s.charAt(0)   =='u' || s.charAt(0)=='A'||s.charAt(0)=='E'||s.charAt(0)=='I'||s.charAt(0)=='O'||s.charAt(0)   =='U') {
                sb.append(s); // If it starts with a vowel, append the word as is
                sb.append("ma");
            } else {
                // If it starts with a consonant, move the first letter to the end
                sb.append(s.substring(1)); // Append the word without the first letter
                sb.append(s.charAt(0));    // Append the first letter
                sb.append("ma");
            }
            for (int j = 0; j <= i; j++) {
                sb.append("a");
            }
            if(i<words.length-1)
            sb.append(" ");
    }
     return sb.toString();
}

}
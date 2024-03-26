class Solution {
    public String truncateSentence(String s, int k) {
        
        int c=0;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)==' ')
            {
                c++;
                sb.append(s.charAt(i));
            }
            else
            sb.append(s.charAt(i));

            if(c==k)
            break;
        }
        return sb.toString().trim();
    }
}

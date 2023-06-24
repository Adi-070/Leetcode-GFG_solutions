class Solution {
    public String removeOuterParentheses(String s) {
        
        StringBuilder sb = new StringBuilder();

        int count=0;

        for(int i=0; i<s.length(); i++)
        {   
            char c = s.charAt(i);

            if(c=='(' && count==0)
            count++;

            else if(c=='(' && count>=1)
            {
                sb.append(c);
                count++;
            }

             else if(c==')' && count>1)
            {
                sb.append(c);
                count--;
            }

            else if(c==')' && count==1)
            count--;

            
        }
        return sb.toString();
    }
}

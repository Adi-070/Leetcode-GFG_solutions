class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len=s.length();
        String q="";

        for(int i=1; i<=len/2; i++)
        {
                int k=s.substring(0,i).length();

                if(k!=0 && len%k==0)
                {
                    StringBuilder sb = new StringBuilder();

                    for(int f=0; f<len/k; f++)
                    {
                        sb.append(s.substring(0,i));
                    }
                    q=sb.toString();
                }
                if(s.equals(q))
                return true;
            
        }
        return false;
    }
}
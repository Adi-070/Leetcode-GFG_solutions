class Solution {
    public int maxScore(String s) {
        
        int one =0;
        int zero=0;
        int max=0;

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='1')
            one++;
        }

        for(int i=0; i<s.length()-1; i++)
        {
            if(s.charAt(i)=='0')
            {
                zero++;
            }
            else if(s.charAt(i)!='0')
            one--;
        
        max = Math.max(max,zero+one);
        }
        return max;
    }
}

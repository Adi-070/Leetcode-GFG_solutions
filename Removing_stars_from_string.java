class Solution {
    public String removeStars(String s) {
        
        while(s.contains("*"))
        {
            for(int i=0; i<s.length(); i++)
            {
                if(i>0 && s.charAt(i)=='*' && Character.isAlphabetic(s.charAt(i-1))) {
                System.out.println(s);                                                                                                //TLE
                s=s.substring(0,i-1)+s.substring(i+1);
                }
                else if(i==0 && s.charAt(i)=='*')
                s=s.substring(i+1);
            }
        }
        return s;
    }
}
..................................................................................................

  class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='*')
            sb.deleteCharAt(sb.length()-1);

            else
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}

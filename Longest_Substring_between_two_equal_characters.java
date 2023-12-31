class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max=0;
        int c=0;

        for(int i=0; i<s.length(); i++)
        {   int a = s.lastIndexOf(s.charAt(i));
            int b = s.indexOf(s.charAt(i));
            System.out.println(a);
            System.out.println(b);
            if(a==b)
            {
                c++;
            }
            max = Math.max(max, a-b-1);
        }
        if(c==s.length())
        return -1;
        
        return max;
    }
}

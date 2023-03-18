class Solution {
    public int romanToInt(String s) {
        int i, j;
        
        s += 'A';
        
        int num = 0;
        
        for(i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == 'I')
            {
                if(s.charAt(i+1) == 'X' || s.charAt(i+1) == 'V')
                {
                    num -= 1;
                }
                else
                {
                    num += 1;
                }
            }
            else if(s.charAt(i) == 'X')
            {
                if(s.charAt(i+1) == 'C' || s.charAt(i+1) == 'L')
                {
                    num -= 10;
                }
                else
                {
                    num += 10;
                }
            }
            else if(s.charAt(i) == 'C')
            {
                if(s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M')
                {
                    num -= 100;
                }
                else
                {
                    num += 100;
                }
            }
            else if(s.charAt(i) == 'V')
            {
                num += 5;
            }
            else if(s.charAt(i) == 'L')
            {
                num += 50;
            }
            else if(s.charAt(i) == 'D')
            {
                num += 500;
            }
            else if(s.charAt(i) == 'M')
            {
                num += 1000;
            }
            
            System.out.println("sum : " + num);
        }
        return num;
    }
}

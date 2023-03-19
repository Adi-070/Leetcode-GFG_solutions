class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        
        do
        {
           slow = findSquare(slow);
           fast = findSquare(findSquare(fast));
        } while(slow!=fast);
        
           if (slow==1 || fast==1)
           return true;

        
        return false;
    }
    private int findSquare(int n) {
     int s = 0;
     while (n>0)
     {
        int r = n%10;
        s = s + r*r;
        n/=10;
     }
        return s;
    }


    }
    

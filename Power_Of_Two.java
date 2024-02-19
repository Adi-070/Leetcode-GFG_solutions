class Solution {
    public boolean isPowerOfTwo(int n) {
        
        if(n<=0)
        return false;

        if(n==1)
        return true;

        if(n%2!=0)
        return false;

        return isPowerOfTwo(n/2);
    }
}
......................................................
class Solution {
    public boolean isPowerOfTwo(int n) {

        if(n<=0) return false;
        while(n%2==0){
            n/=2;
        }
       if (n==1) return true;
       else return false;
    }
}

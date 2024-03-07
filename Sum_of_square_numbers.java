class Solution {
    public boolean judgeSquareSum(int c) {
        
        if(c<3)
        return true;
        
        long low=0;
        long high=(long)Math.sqrt(c);

        while(low<=high)
        {

            if(low*low + high*high<c)
            low++;

            else if(low*low+ high*high>c)
            high--;

            else
            return true;
        }
        return false;
    }
}

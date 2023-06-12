class Solution {
    public boolean judgeCircle(String moves) {
        int counter1 =0, counter2=0;

        for(int i=0; i<moves.length(); i++)
        {
            if(moves.charAt(i)=='R')
            counter1++;

            else if(moves.charAt(i)=='L')
            counter1--;

            else if(moves.charAt(i)=='U')
            counter2++;

            else if(moves.charAt(i)=='D')
            counter2--;
        }
        return counter1==0 && counter2==0;
    }
}

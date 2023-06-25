class Solution {
    public int maxDepth(String s) {

        int count =0;
        int max=Integer.MIN_VALUE;

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='(')
            count++;

            else if(s.charAt(i)==')')
            count--;

            max=Math.max(max,count);
        }
        return max;
    }
}

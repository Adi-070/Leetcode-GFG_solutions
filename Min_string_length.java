class Solution {
    public int minLength(String s) {

        Stack<Character> stk = new Stack<>();

        stk.push(s.charAt(0));

        for(int i=1; i<s.length(); i++)
        {
            if(!stk.isEmpty() && ((stk.peek()=='A' && s.charAt(i)=='B') || (stk.peek()=='C' && s.charAt(i)=='D'))) 

            stk.pop();


            else
            stk.push(s.charAt(i));
        }
        return stk.size();
    }
}

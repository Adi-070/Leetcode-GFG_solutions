class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stk = new Stack<>();

        for(int i=0; i<s.length(); i++)
        {
            char c=s.charAt(i);

            if(c==')')
            {
                if(!stk.isEmpty() && stk.peek()=='(')
                stk.pop();

                else
                stk.push(c);
            }
            else
            stk.push(c);
        }
        return stk.size();
    }
}
class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stk = new Stack<>();

        int a,b;

        for(int i=0; i<tokens.length; i++)
        {
            if(!tokens[i].equals("+") &&!tokens[i].equals("-")  && !tokens[i].equals("*") &&            !tokens[i].equals("/"))
            stk.push(Integer.valueOf(tokens[i]));

            else if (tokens[i].equals("+"))
            {
             a = stk.pop();
             b = stk.pop();

                stk.push(a+b);
            }
             else if (tokens[i].equals("-"))
            {
             a = stk.pop();
             b = stk.pop();

                stk.push(b-a);
            }
             else if (tokens[i].equals("*"))
            {
             a = stk.pop();
             b = stk.pop();

                stk.push(a*b);
            }
             else if (tokens[i].equals("/"))
            {
                 a = stk.pop();
                 b = stk.pop();

                stk.push(b/a);
            }
        }
        return stk.pop();
    }
}

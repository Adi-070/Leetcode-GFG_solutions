class Solution {
    public String minRemoveToMakeValid(String s) {
        
        Stack<Integer> stk = new Stack<>();

        StringBuilder sb = new StringBuilder(s);

        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);

            if(c=='(')
            stk.push(i);

            else if(c==')' && stk.size()>0 && s.charAt(stk.peek())=='(')
            stk.pop();

            else if(c==')')
            stk.push(i);
        }
        while(!stk.isEmpty())
        sb.deleteCharAt(stk.pop());

        return sb.toString();
    }
}

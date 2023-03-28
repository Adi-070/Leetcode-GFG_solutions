class Solution {
    public boolean isValid(String s) {
        Stack<Character> f = new Stack<Character>();
        for( char c : s.toCharArray())
        {
            if(c == '(')
            f.push(')');
            else if(c == '{')
            f.push('}');
            else if(c == '[')
            f.push(']');

            else if(f.isEmpty() || f.pop()!=c)
            return false;
        }
        return f.isEmpty();
    }
}
.................................................................................
    
    class Solution {
    public boolean isValid(String s) {
        Stack<Character> f = new Stack<Character>();
        for( char ch : s.toCharArray())
        {
            if(ch=='(' || ch=='{' || ch=='[')
            f.push(ch);

            else if (ch==')')
            {
                if( f.isEmpty() || f.pop()!='(' )
                return false;
            }

            else if (ch=='}')
            {
                if( f.isEmpty()||f.pop()!='{' )
                return false;
            }

            else if (ch==']')
            {
                if( f.isEmpty()||f.pop()!='['  )
                return false;
            }

        }
        return f.isEmpty();
}
}

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

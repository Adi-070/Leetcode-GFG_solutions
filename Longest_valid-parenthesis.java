class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack= new Stack<>();
        int max_ans = 0;
        stack.push(-1);

        for(int i=0;i<s.length();i++)
        {
            if (s.charAt(i) == '(')
            stack.push(i);
            else {
            stack.pop();

            if(stack.isEmpty())
            stack.push(i);
            
            else
            max_ans = Math.max(max_ans, i-stack.peek());
            } 
        }
        return max_ans;
    }
}

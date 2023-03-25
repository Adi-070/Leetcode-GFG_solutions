class Solution {

    Stack<Character> stk = new Stack<>();
    public String removeDuplicates(String s) {
        for(int i =0; i<s.length(); i++)
        {
                if(!stk.isEmpty())
                {
                    if(stk.peek().equals(s.charAt(i)))
                    {
                        stk.pop();
                    }
                    else
                    {
                        stk.push(s.charAt(i));
                    }
                }
                else
                {
                    stk.push(s.charAt(i));
                }
        }

        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty())
        {
            sb.append(stk.pop());

        }
        return sb.reverse().toString();
        }
    }

.................................................................................
  
  class Solution {

    Stack<Character> stk = new Stack<>();
    public String removeDuplicates(String s) {
        for(int i =0; i<s.length(); i++)
        {
                if(!stk.isEmpty())
                {
                    if(stk.peek().equals(s.charAt(i)))
                    {
                        stk.pop();
                    }
                    else
                    {
                        stk.push(s.charAt(i));
                    }
                }
                else
                {
                    stk.push(s.charAt(i));
                }
        }

        String sb = "";
        while(!stk.isEmpty())
        {
            sb =  stk.pop() + sb;
           

        }
        return sb;
        }
    }

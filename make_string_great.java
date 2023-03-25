class Solution {
    public String makeGood(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i =0; i<s.length(); i++)
        {       char top = '0';
                if (!stk.isEmpty()) 
             top = stk.peek();
               char curr = s.charAt(i);
                if(!stk.isEmpty())
                {
                    if (Character.toLowerCase(top) == Character.toLowerCase(curr) &&
                ((Character.isUpperCase(top) && Character.isLowerCase(curr)) ||
                (Character.isLowerCase(top) && Character.isUpperCase(curr)))) {

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

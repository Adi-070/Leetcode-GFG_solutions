class Solution {
    public boolean isValid(String s) {

        while(s.contains("abc"))
        {
        s=s.replace("abc","");
        }
        
        return s.isEmpty();
    }
}
................................................................

class Solution {
    public boolean isValid(String s) {

      Stack<Character> stk = new Stack<>();

      for(int i=0; i<s.length(); i++)
      {
          if(s.charAt(i)=='a' || s.charAt(i)=='b')
          stk.push(s.charAt(i));

          else {

            if(stk.size()>0 && stk.peek()=='b')
            stk.pop();

            else
            return false;

            if(stk.size()>0 && stk.peek()=='a')
            stk.pop();

            else
            return false;
          }
      }  

      if(stk.size()==0)
      return true;

      return false;
    }
}

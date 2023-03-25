class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stk1 = new Stack<>();
        Stack<Character> stk2 = new Stack<>();

      for(int i=0;i<s.length();i++){
             if (s.charAt(i) != '#') {
                stk1.push(s.charAt(i));
            } else if (!stk1.isEmpty()) {
                stk1.pop();
            }
         }

         for(int i=0;i<t.length();i++){
             if (t.charAt(i) != '#') {
                stk2.push(t.charAt(i));
            } else if (!stk2.isEmpty()) {
                stk2.pop();
            }
         }

          while(!stk1.isEmpty()&&!stk2.isEmpty()){
              if(stk1.pop()!=stk2.pop()){
                  return false;
              }
          }
          if(stk1.isEmpty()&&stk2.isEmpty()){
              return true;
          }
          return false;
    }
      
        }

    
    

class Solution {
    public int clumsy(int n) {
        
        Stack<Integer> stk = new Stack<>();

        char[] operations = new char[]{'*','/','+','-'};
        int index = 0;
        stk.push(n--);

      while(n > 0) {
            switch(operations[index]) {
                case '*': 
                    stk.push(stk.pop() * n);
                    break;
                case '/':
                    stk.push(stk.pop() / n);
                    break;
                case '+':
                    stk.push(stk.pop() + n);
                    break;
                case '-':
                    stk.push(-1 * n);
            }
      
        index = (index + 1) % 4;
        n--;
      }  
        int sum = 0;

        while(!stk.isEmpty())
        sum += stk.pop();

        return sum;
}
}

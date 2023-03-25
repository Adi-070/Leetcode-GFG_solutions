class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stk = new Stack<>();

        for(int i = 0; i<operations.length;i++)
        {
            if(operations[i].equals("C"))
            stk.pop();

            else if (operations[i].equals("D"))
            stk.push(stk.peek()*2);

            else if (operations[i].equals("+"))
            {
            int x = stk.pop();
            int y = stk.pop();

            int z = x+y;
            stk.push(y);
            stk.push(x);
            stk.push(z);
        }
        else
        stk.push(Integer.parseInt(operations[i]));
    }

    int sum = 0;
    while(!stk.isEmpty())
    {
        sum+=stk.pop();
    }
    return sum;
}
}

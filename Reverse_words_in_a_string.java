class Solution {
    public String reverseWords(String s) {
        
        Stack<String> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(String c: s.split(" "))
        {
        if(!c.isEmpty())
        stk.push(c);
        }

        System.out.println(stk);

        while(!stk.isEmpty())
        {
        sb.append(stk.pop());
        sb.append(" ");
        }
        

        return sb.toString().trim();

    }
}

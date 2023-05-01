//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String S = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.maxLength(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maxLength(String s){
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
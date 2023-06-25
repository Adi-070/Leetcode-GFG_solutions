//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String s)
    {
        Stack<String> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(String c: s.split("\\."))
        {
        //if(!c.isEmpty())
        stk.push(c);
        }

       // System.out.println(stk);

        while(!stk.isEmpty())
        {
        sb.append(stk.pop());
        sb.append(".");
        }
        
        String S = sb.toString();
        

        return S.substring(0,S.length()-1);
    }
}

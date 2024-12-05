//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String text = sc.next();
            String pat = sc.next();
            Solution obj = new Solution();
            int res = obj.findMatching(text, pat);
            System.out.println(res);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findMatching(String text, String pat) {
        
        int n=text.length();
        int m=pat.length();
        
        if(m>n)
        return -1;
        
        for(int i=0; i<=n-m; i++)
        {
            if(text.substring(i,i+m).equals(pat))
            return i;
        }
        return -1;
    }
}

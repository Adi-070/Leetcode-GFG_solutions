//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String strs[], int n){
         Arrays.sort(strs);

        String str1 = strs[0];
        String str2 = strs[strs.length-1];

        int i;

        for(i=0; i<str1.length() && i<str2.length(); i++)
        {
            if(str1.charAt(i)!=str2.charAt(i))
            break;
            
        }
        if(i==0)
        return "-1";

        return str1.substring(0,i);
    }
}
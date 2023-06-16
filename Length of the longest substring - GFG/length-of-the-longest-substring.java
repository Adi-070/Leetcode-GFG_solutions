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
            String s = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubsttr(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    int longestUniqueSubsttr(String S){
        
        int i=0;
        int j=0;
        
        int max = 0;
        
        HashSet<Character> set = new HashSet<>();
        
        while(j<S.length())
        {
            if(!set.contains(S.charAt(j)))
            {
            set.add(S.charAt(j++));
            max = Math.max(max,set.size());
            }
            
            else
            {
                
                set.remove(S.charAt(i++));
            }
        }
        return max;
    }
}
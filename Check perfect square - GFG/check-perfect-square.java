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
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.checkPerfectSquare(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static int checkPerfectSquare(int num){
       int low =1;
        int high=num;

        while(low<=high)
        {
            long mid=low + (high-low)/2;

            if(mid*mid==num)
            return 1;

            else if(mid*mid<num)
            low=(int)mid+1;

            else
            high=(int)mid-1;
        }
        return 0;
    }
}
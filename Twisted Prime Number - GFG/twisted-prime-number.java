//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isTwistedPrime(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isTwistedPrime(int N) {
        
        int n = reverse(N);
        
        if(prime(N)==1)
        {
            if(prime(n)==1)
            return 1;
        }
        
        return 0;
    }
    int prime(long N) {
        
        if(N==1)
        return 0;
        
        for(int i=2; i<=Math.sqrt(N); i++)
        {
            if(N%i==0)
            return 0;
        }
        return 1;
    }
    int reverse(int N) {
        
        int s =0;
        
        while(N!=0) {
            
            int r = (int)N%10;
            s = s*10 + r;
            N = N/10; 
        }
        return s;
    }
}
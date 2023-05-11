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
            String S[] = read.readLine().split(" ");
            int L = Integer.parseInt(S[0]);
            int R = Integer.parseInt(S[1]);
            Solution ob = new Solution();
            System.out.println(ob.countPrimes(L, R));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int countPrimes(int L, int R) {
       if(R<2)
        return 0;

        boolean isPrime[] = new boolean[R+1];
        Arrays.fill(isPrime, true);

        isPrime[0]=false;
        isPrime[1]=false;

        for(int i=2; i*i<=R; i++)
        {
            for(int j=2*i; j<=R; j+=i)
            {
                isPrime[j]=false;
            }
        }
        int count=0;
        for(int i=L;i<=R;i++){
            if(isPrime[i]==true){
                count++;
            }
        }
        return count;
    }
};
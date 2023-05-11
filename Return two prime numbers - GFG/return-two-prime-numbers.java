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
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.primeDivision(N);
            System.out.println(ans.get(0) + " " + ans.get(1));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static List<Integer> primeDivision(int N){
      ArrayList<Integer> list = new ArrayList<>();
      
      for(int i=1; i<=N; i++)
      {
          if(isPrime(i)&&isPrime(N-i))
          {
              list.add(i);
              list.add(N-i);
          }
          
      }
      return list;
    }
    static boolean isPrime(int n)
    {
        int c=0;
        
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==2)
        return true;
        
        return false;
    }
}
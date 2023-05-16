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
            int A[] = new int[N];
            String[] S = read.readLine().split(" ");
            for (int i = 0; i < N; i++) A[i] = Integer.parseInt(S[i]);
            Solution ob = new Solution();
            System.out.println(ob.countElements(N, A));
        }
    }
}
// } Driver Code Ends


// User function Template for Java



// User function Template for Java

class Solution {
    int countElements(int N, int A[]) {
        if(N==0||N==1)
        return 0;
        
        int max = max(A);
        int min = min(A);
        
        int c = max-min;
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i:A)
        set.add(i);
     
        return c-set.size()+1;
    }
    int max(int A[])
    {
        int max = Integer.MIN_VALUE;
        
        for(int i:A)
        {
            if(i>max)
            max=i;
        }
        return max;
    }
    int min(int A[])
    {
        int min = Integer.MAX_VALUE;
        
        for(int i:A)
        {
            if(i<min)
            min=i;
        }
        return min;
    }
}
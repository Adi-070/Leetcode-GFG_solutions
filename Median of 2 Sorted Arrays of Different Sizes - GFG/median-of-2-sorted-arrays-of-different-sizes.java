//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver
{
    public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int  m= sc.nextInt();
            int []b = new int[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            
            double res = new GFG().medianOfArrays(n, m, a, b);
            
            if (res == (int)res) System.out.println ((int)res);
            else System.out.println (res);
        }
    		
	} 
}
// } Driver Code Ends


//User function Template for Java

class GFG 
{ 
    static double medianOfArrays(int n, int m, int nums1[], int nums2[]) 
    {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i:nums1)
        list.add(i);

        for(int i:nums2)
        list.add(i);

        Collections.sort(list);

        int f=list.size();

        if(f%2!=0)
        return list.get(f/2);

        double ans = (list.get(f/2 -1) + list.get(f/2));

        return ans/2;
    }
}
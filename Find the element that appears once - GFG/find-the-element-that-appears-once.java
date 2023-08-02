//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; ++i)
                arr[i] = sc.nextInt ();

    		System.out.println (new Sol().search (arr, n));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int search(int A[], int N)
    {   
        
        if(A.length==1)
        return A[0];
        
        int low=1;
        int high=A.length-2;
        
        if(A[0]!=A[1])
        return A[0];
        
        if(A[A.length-1]!=A[A.length-2])
        return A[A.length-1];
        
        
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            
            if(mid%2!=0)
            {
            if(A[mid]==A[mid+1])
            high=mid-1;
            
            else if(A[mid]==A[mid-1])
            low=mid+1;
            
            else
            return A[mid];
            }
            
            else {
            
            if(A[mid]==A[mid+1])
            low=mid+1;
            
            else if(A[mid]==A[mid-1])
            high=mid-1;
            
            else
            return A[mid];
            }
        }
        return A[low];
    }
}
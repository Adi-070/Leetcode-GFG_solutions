//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0;i < n;i++)
            {
                arr[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            System.out.println(sol.findOnce(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    int findOnce(int A[], int n)
    {
        
        if(A.length==1)
        return A[0];
        
        if(A[0]!=A[1])
        return A[0];
        
        if(A[A.length-1]!=A[A.length-2])
        return A[A.length-1];
        
        int low=1;
        int high=A.length-2;
        
        
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
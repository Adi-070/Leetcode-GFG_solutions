//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int[] ans = obj.sortedArrayToBST(nums);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] sortedArrayToBST(int[] nums)
    {   
        int arr[] = new int[nums.length];
        createBST(nums,0,nums.length-1,arr);
        return arr;
    }
    
    int i=0;
    
    public void createBST(int[] nums, int low, int high, int a[])
    {   
        if(low>high)
        return;
        
        int mid = (low+high)/2;
        
        a[i++]=nums[mid];
        
        createBST(nums,low,mid-1,a);
        createBST(nums,mid+1,high,a);
        
        
    }
}
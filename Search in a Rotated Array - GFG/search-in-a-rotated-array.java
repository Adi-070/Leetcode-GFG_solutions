//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0)
        {
            int n = Integer.parseInt(in.readLine().trim());
            int A[] = new int[n];
            String s[]=in.readLine().trim().split(" ");
            for (int i = 0;i < n;i++)
            {
                A[i] = Integer.parseInt(s[i]);
            }
            int key = Integer.parseInt(in.readLine().trim());
            
            out.println(new Solution().search(A, 0, n - 1, key));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    int search(int nums[], int start, int end, int target)
    {
            start =0;
        end = nums.length-1;
         
        while(start<=end)
        {
        int mid = start + (end-start)/2;

        if (nums[mid]==target)
        return mid;

        if(nums[start]<=nums[mid])
        {
            if (target>=nums[start]&& target<=nums[mid])
            end = mid-1;

            else
            start=mid+1;
        }

        else
        {
            if (target>=nums[mid]&& target<=nums[end])
            start=mid+1;

            else
            end=mid-1;
        }
}
        return -1;
    }
}
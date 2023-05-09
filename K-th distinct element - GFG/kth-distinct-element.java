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
            String a = br.readLine().trim();
            String[] a1 = a.split(" ");
            int n = Integer.parseInt(a1[0]);
            int k = Integer.parseInt(a1[1]);
            String b = br.readLine().trim();
            String[] b1 = b.split(" "); 
            int[] nums = new int[n];
            for(int i = 0; i < n; i++)
                nums[i] = Integer.parseInt(b1[i]);
            Solution ob = new Solution();
            int ans = ob.KthDistinct(nums,k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int KthDistinct(int[] nums,int k)
    {   
        int c=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i:nums)
        map.put(i,map.getOrDefault(i,0)+1);
        
        for(int i:nums)
        {
        if(map.get(i)==1)
        c++;
        
        if(c==k)
        return i;
        }
        return -1;
    }
}
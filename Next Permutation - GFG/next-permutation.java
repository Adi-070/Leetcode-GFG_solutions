//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> nextPermutation(int N, int nums[]){
        int idx1=-1;
        int idx2=-1;

        List<Integer> list = new ArrayList<>();

        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                idx1=i;
                break;
            }
        }
        if(idx1==-1)
        reverse(nums,0);
else {
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[idx1]<nums[i])
            {
                idx2=i;
                break;
            }
        }
        swap(nums,idx1,idx2);
        reverse(nums,idx1+1);
    } 
        for(int i:nums)
        list.add(i);
        
        return list;
        
    
    }
     public static void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void reverse(int[] nums, int start)
    {
      int  i=start;
        int j=nums.length-1;
        while(i<j)
        {
        swap(nums,i,j);
        i++;
        j--;
        }
    }
}
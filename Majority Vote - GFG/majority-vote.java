//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] nums = IntArray.input(br, n);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.Solve(n, nums);
            
            IntArray.print(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> Solve(int n, int[] arr) {
         ArrayList<Integer> list = new ArrayList<>();

        int nums1 = Integer.MIN_VALUE;
        int nums2 = Integer.MIN_VALUE;

        int count1=0;
        int count2=0;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==nums1)
            {
                count1++;
            }
            else if(arr[i]==nums2)
            {
                count2++;
            }
            else if(count1==0)
            {
                nums1=arr[i];
                count1=1;
            }
            else if(count2==0)
            {
                nums2=arr[i];
                count2=1;
            }
            else
            {
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==nums1)
            count1++;

            if(arr[i]==nums2)
            count2++;
        }
        if(count1 > arr.length/3)
        list.add(nums1);

        if(count2>arr.length/3)
        list.add(nums2);
        
        if(list.size()==0)
        {
            list.add(-1);
            return list;
        }
        
        return list;
    }
}
        

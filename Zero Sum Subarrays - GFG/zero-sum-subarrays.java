//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    int n;
		    n=sc.nextInt();
		    
		    long arr[]=new long[n];
	
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextLong();
		    }
            Solution ob = new Solution();
		    System.out.println(ob.findSubarray(arr,n));
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] nums ,int n) 
    {
         HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int c=0;

        map.put(0,1);

        for(int i=0; i<nums.length; i++)
        {
            sum +=nums[i];

            if(map.containsKey(sum))
            c +=map.get(sum);

            map.put(sum,map.getOrDefault(sum,0)+1);

        }
        return c;
    }
}
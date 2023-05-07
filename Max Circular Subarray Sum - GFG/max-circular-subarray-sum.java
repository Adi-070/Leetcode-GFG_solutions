//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());// input size of array
		    int arr[] = new int[n];
		    String inputLine2[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine2[i]); // input elements of array
		    }
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.circularSubarraySum(arr, n));// print the circularSubarraySum
		}
	}
}



// } Driver Code Ends


class Solution{

    // a: input array
    // n: size of array
    //Function to find maximum circular subarray sum.
    static int circularSubarraySum(int a[], int n) {
        
      int sum = 0;
        
    for(int i= 0; i< n; i++)
        sum += a[i];
        
        int maxsum = kadane(a,n);
        int minsum = sum-reverseKadane(a,n);
        
        if(minsum==0)
        return maxsum;
        
        
        return Math.max(maxsum, minsum);
    }
    
    static int kadane(int a[], int n)
    {   
        int sum=0;
         int max=Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++)
        {
            sum += a[i];
            
            max = Math.max(max,sum);
            
            if(sum<0)
            sum=0;
        }
        return max;
    }
    
     static int reverseKadane(int a[], int n)
    {   
        int sum=0;
        int min=Integer.MAX_VALUE;
        
        for(int i=0; i<n; i++)
        {
            sum += a[i];
            
            min = Math.min(min,sum);
            
            if(sum>0)
            sum=0;
        }
        return min;
    }
    
}


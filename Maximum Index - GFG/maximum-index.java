//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim()); // size of array
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
		    }
		    
		    Solution ob = new Solution();
		    
		    System.out.println(ob.maxIndexDiff(arr, n)); // print the result
		}
	}
}
// } Driver Code Ends


class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int a[], int n) { 
        
        // Your code here
        int[] lmin = new int[n];
        int[] rmax = new int[n];
        lmin[0]=a[0];
        rmax[n-1] = a[n-1];
        for(int i=1;i<n;i++){
            lmin[i] = Math.min(lmin[i-1],a[i]);
        }
        for(int i=n-2;i>=0;i--){
            rmax[i] = Math.max(rmax[i+1],a[i]);
        }
        int i=0;
        int j=0;
        int maxDiff = 0;
        while(i<n&&j<n){
            if(lmin[i]<=rmax[j]){
                maxDiff = Math.max(j-i,maxDiff);
                j++;
            }else{
                i++;
            }
        }
        return maxDiff;
    }
}
........................................................................................
	
	
	class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int arr[], int N) { 
        
        int max = 0;
        
        for(int i=0; i<N; i++)
        {
            int j=N-1;
            
            while(i<j)
            {
            if(arr[i]<=arr[j])
             {
            max = Math.max(max,j-i);
            break;
             }
            j--;
            } 
        }
        return max;
    }
}

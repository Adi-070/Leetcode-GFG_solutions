//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    long n = Long.parseLong(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[(int)n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    System.out.println(new Solution().getMaxArea(arr, n));
		}
	}
}




// } Driver Code Ends

class Pair{
    int first;
    int second;
    Pair(int _first,int _second){
        this.first=_first;
        this.second=_second;
    }
}

class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) 
    {
        // your code here
        
        int[] left = new int[(int) n];
        int[] right = new int[(int) n];
        
        
        Stack<Pair> stk = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stk.empty() && stk.peek().first >= hist[i]) {
                stk.pop();
            }

            left[i] = stk.empty() ? -1 : stk.peek().second;
            stk.push(new Pair((int)hist[i], i));
        }
        Stack<Pair> stk1 = new Stack<>();
         for (int i = (int) n - 1; i >= 0; i--) {
            while (!stk1.empty() && stk1.peek().first >= hist[i]) {
                stk1.pop();
            }

            right[i] = stk1.empty() ? (int) n : stk1.peek().second;
            stk1.push(new Pair((int)hist[i], i));
        }

        long maxArea = 0;
        for (int i = 0; i < n; i++) {
            long width = right[i] - left[i] - 1;
            long area = hist[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
        
    }
        
}


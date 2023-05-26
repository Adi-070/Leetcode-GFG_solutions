//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaxAverage(arr, n, k);
            for(int i=ans; i<ans+k; i++)
                System.out.print(arr[i]+" ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int findMaxAverage(int[] nums, int n, int k) {
        int average=0;
        int sum=0;
        int max = Integer.MIN_VALUE;

        int i=0;
        int j=0;
        int pos=-1;

        while(j<n)
        {
            sum += nums[j];

            if(j-i+1<k)
            j++;

            else if(j-i+1==k)
            {
            average=sum/k;
           if(max<sum)
           {
               max=sum;
               pos=i;
           }

            sum -= nums[i];
            i++;
           j++;
            
            }
             
        }
        return pos;
    }
}

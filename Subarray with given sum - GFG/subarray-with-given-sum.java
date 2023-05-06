//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	static BufferedReader br;
    static PrintWriter ot;
    public static void main(String[] args) throws IOException{
        
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            
            String s[] = br.readLine().trim().split(" ");
            
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int a[] = new int[n];
            s = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(a, n, k);
            for(int ii = 0;ii<res.size();ii++)
                ot.print(res.get(ii) + " ");
            ot.println();
        }
        ot.close();
    }

}
// } Driver Code Ends


class Solution
{
    
     static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        int left=0,right=0;
        int curSum=arr[0];
        ArrayList<Integer> list=new ArrayList<>();
        if(s==0)
        {
            list.add(-1);
            return list;
        }
        while(right<n)
        {
            if(curSum==s)
            {
                list.add(left+1);
                list.add(right+1);
                return list;
            }
            else if(curSum<s)
            {
                right++;
                if(right>=n) break;
                curSum=curSum+arr[right];
            }
            else
            {
                curSum=curSum-arr[left];
                left++;
            }
        }
        list.add(-1);
        return list;
    }
}
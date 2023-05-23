//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int l = sc.nextInt();
            int n = sc.nextInt();
            
            int arr[] =  new int[l];
            
            for(int i = 0;i<l;i++)
                arr[i] = sc.nextInt();
            
            Solution ob = new Solution();
                
            if(ob.findPair(arr, l, n)==true)
                System.out.println(1);
                
            else
                System.out.println(-1);    
                
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public boolean findPair(int arr[], int size, int n)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i:arr)
        {
            if(map.containsKey(i+n)||map.containsKey(i-n))
            return true;
            
            map.put(i,map.getOrDefault(i,0)+1);
        }
        return false;
    }
}
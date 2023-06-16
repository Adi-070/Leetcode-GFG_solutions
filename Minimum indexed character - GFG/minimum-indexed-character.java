//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function template for JAVA

class Solution
{
    //Function to find the minimum indexed character.
    public static int minIndexChar(String str, String patt)
    {
       HashMap<Character,Integer> map = new HashMap<>();
       HashMap<Character,Integer> map2 = new HashMap<>();
       
       int min=Integer.MAX_VALUE;
       
       
       for(int i=0; i<str.length(); i++)
       {
           if(map.containsKey(str.charAt(i)))
           continue;
           
           else
           map.put(str.charAt(i),i);
       }
       
      for(int i=0; i<patt.length(); i++)
      {
           if(map2.containsKey(patt.charAt(i)))
           continue;
           
           else
           map2.put(patt.charAt(i),i);
      }
    //   System.out.println(map);
    //   System.out.println(map2);
     
     for(char i:map.keySet())
     {
         if(map2.containsKey(i))
         min=Math.min(min,map.get(i));
     }
     if(min==Integer.MAX_VALUE)
     return -1;
     
     return min;
    }
}

//{ Driver Code Starts.

class GFG {
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		    t--;
		    
		    String s1=sc.next();
		    String s2=sc.next();
		    
		    int res = new Solution().minIndexChar(s1, s2);
		    System.out.println(res);
		}
	}
}

// } Driver Code Ends
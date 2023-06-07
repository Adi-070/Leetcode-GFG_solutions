//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.*;


public class Driver {
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            
            Solution obj = new Solution();
            
            boolean a = obj.areIsomorphic(s1,s2);
            if(a)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
    
}

// } Driver Code Ends


class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String s,String t)
    {
        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Boolean> map2 = new HashMap<>();
        
        if(s.length()!=t.length())
        return false;

        for(int i=0; i<s.length(); i++)
        {   
            if(map1.containsKey(s.charAt(i)))
            {
                if(map1.get(s.charAt(i)) != t.charAt(i))
                return false;
            }

            else if(map2.containsKey(t.charAt(i)))
            return false;

            map1.put(s.charAt(i),t.charAt(i));
            map2.put(t.charAt(i),true);
        }
        return true;
        
    }
}




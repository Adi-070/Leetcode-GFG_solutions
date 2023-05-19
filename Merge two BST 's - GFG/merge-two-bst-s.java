//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.math.*;

class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        
        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
              // Get and remove the front of the queue
              Node currNode = q.remove();
        
              // Get the curr node's value from the string
              String currVal = s[i];
        
              // If the left child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the left child for the curr node
                  currNode.left = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.left);
              }
        
              // For the right child
              i++;
              if(i >= s.length)
                  break;
              currVal = s[i];
        
              // If the right child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the right child for the curr node
                  currNode.right = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.right);
              }
              
              i++;
        }
    
        return root;
    }
    
    public static void main(String args[]) throws IOException {
    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine();
            Node root1 = buildTree(s);
            
            s = br.readLine();
            Node root2 = buildTree(s);
            
            Solution T = new Solution();
            List<Integer> ans = T.merge(root1,root2);
            for(int i=0;i<ans.size();i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
            
            t--;
        }
    }
}

// } Driver Code Ends


//User function Template for Java




    

class Solution
{
    //Function to return a list of integers denoting the node 
    //values of both the BST in a sorted order.
    ArrayList<Integer> list1,list2;
    public List<Integer> merge(Node root1,Node root2)
    {
        // Write your code here
        List<Integer> ans = new ArrayList<>();
        list1=new ArrayList<>();
        list2=new ArrayList<>();
        
        dfs(root1,1);
        dfs(root2,2);
        
        int i=0,j=0;
        while(i<list1.size()&&j<list2.size())
        {
            int val1=list1.get(i);
            int val2=list2.get(j);
            if(val1<val2)
            {
                ans.add(val1);i++;
            }else
            {
                ans.add(val2);j++;
            }
        }
        
        while(i<list1.size())
        {
            ans.add(list1.get(i));i++;
        }
        
        while(j<list2.size())
        {
            ans.add(list2.get(j));j++;
        }
        return ans;
    }
    public void dfs(Node root,int type)
    {
        if(root==null)return;
        
        dfs(root.left,type);
        if(type==1)list1.add(root.data);
        else list2.add(root.data);
        dfs(root.right,type);
    }
}

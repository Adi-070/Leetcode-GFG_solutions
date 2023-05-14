//{ Driver Code Starts
//Initial Template for Java

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class GfG {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws Exception{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
            //Scanner sc = new Scanner(System.in);
	        while(t > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
        	    Solution g = new Solution();
        	    String X = br.readLine();
        	    String arr[] = X.split(" ");
        	    int x , y;
			    x = Integer.parseInt(arr[0]);
			    y = Integer.parseInt(arr[1]);
			    if(g.isCousins(root,x,y))
			        System.out.println(1);
			     else
			        System.out.println(0);
                t--;
            
        }
    }
  
}


// } Driver Code Ends


/*
Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
//User function Template for Java

class Solution {
    
    
    public boolean isCousins(Node root, int a, int b) {
       
        HashMap<Integer,pair> map = new HashMap<>();
        Queue<Node> q = new LinkedList<>();
        
        q.add(root);
        
        int level=1;
        
        while(!q.isEmpty())
        {
            int size = q.size();
            
            for(int i=0; i<size; i++)
            {
                Node current = q.remove();
                
                if(current.left!=null)
                {
                q.add(current.left);
                
                if(current.left.data==a)
                map.put(a, new pair(current.data, level));
                
                if(current.left.data==b)
                map.put(b, new pair(current.data, level));
                }
                
                if(current.right!=null)
                {
                q.add(current.right);
                
                
                if(current.right.data==a)
                map.put(a, new pair(current.data, level));
                
                if(current.right.data==b)
                map.put(b, new pair(current.data, level));
                }
                
            }
            level++;
        }
        pair p1 = map.get(a);
        pair p2 = map.get(b);
        
        if(p1!=null && p2!=null && p1.parent!=p2.parent && p1.level==p2.level)
        return true;
        
        return false;
        
    }

}

class pair
{
    int parent;
    int level;
    
    pair(int parent, int level)
    {
        this.parent=parent;
        this.level=level;
    }
}
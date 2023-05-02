//{ Driver Code Starts


import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{
	static BufferedReader br;
	static PrintWriter ot;
    public static void main(String args[]) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		ot = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine().trim());
		while(t-- > 0){
			String s[] = br.readLine().trim().split(" ");
			int V = Integer.parseInt(s[0]);
			int E = Integer.parseInt(s[1]);
			int edges[][] = new int[E][3];
			for(int i = 0; i < E; i++){
				s = br.readLine().trim().split(" ");
				edges[i][0] = Integer.parseInt(s[0]);
				edges[i][1] = Integer.parseInt(s[1]);
				edges[i][2] = Integer.parseInt(s[2]);
			}
			ot.println(new Solution().spanningTree(V, E, edges));
		}
		ot.close();
	}
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    
    
	static int spanningTree(int V, int E, int edges[][]){
	    
	   ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
	   
	   for(int i=0; i<V; i++)
	   adj.add(new ArrayList<>());
	   
	   for(int i=0; i<E; i++)
	   {
	       int u = edges[i][0];
	       int v = edges[i][1];
	       int wt = edges[i][2];
	       
	       adj.get(u).add(new Pair(v,wt));
	       adj.get(v).add(new Pair(u,wt));
	   }
	   
	   boolean visited[] = new boolean[V];
	   
	   PriorityQueue<Pair> q = new PriorityQueue<>();
	   
	   q.add(new Pair(0,0));
	   
	   int sum=0;
	   
	   while(!q.isEmpty())
	   {
	       Pair current = q.remove();
	       
	       int a =current.v;
	       int b =current.wt;
	       
	       if(visited[a])
	       continue;
	       
	       visited[a]=true;
	       
	       sum +=b;
	       
	       for(Pair element: adj.get(a))
	       {
	           if (!visited[element.v])
	           q.add(element);
	           
	       }
	       
	   }
	   
	   return sum;
	}
}

class Pair implements Comparable<Pair>
{
    int v;
    int wt;

    Pair (int v, int wt)
    {
        this.v=v;
        this.wt=wt;
    }

 public int compareTo(Pair that)
   {
       return this.wt-that.wt;
    }
}
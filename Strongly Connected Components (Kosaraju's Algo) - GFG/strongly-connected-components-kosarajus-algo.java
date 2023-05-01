//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Gfg
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            // arraylist of arraylist to represent graph
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            int V = Integer.parseInt(sc.next());
            int E = Integer.parseInt(sc.next());
            
            for(int i =0; i < V; i++)
                adj.add(i, new ArrayList<Integer>());
                
            for(int i = 1; i <= E; i++)
            {    int u = Integer.parseInt(sc.next());
                 int v = Integer.parseInt(sc.next());
                 
                 // adding directed edgese between 
                 // vertex 'u' and 'v'
                 adj.get(u).add(v);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.kosaraju(V, adj));
		}
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to find number of strongly connected components in the graph.
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj)
    {
         boolean[] visited = new boolean[V];
        Stack<Integer> stk  = new Stack<>();
        ArrayList<ArrayList<Integer>> transpose = new ArrayList<>();
        for(int i=0;i<V;i++){
            if(!visited[i]){
                dfs(adj,i,stk,visited);
            }
        }
        for(int i=0;i<V;i++) transpose.add(new ArrayList<>());
        for(int i=0;i<V;i++){
            visited[i] = false;
            for(int it:adj.get(i)){
                transpose.get(it).add(i);
            }
        }
        int cnt = 0;
        while(!stk.isEmpty()){
            int node = stk.pop();
            if(!visited[node]) {
                revDFS(transpose,node,visited);
                cnt++;
            }
        }
        return cnt;
    }
    
    void dfs(ArrayList<ArrayList<Integer>> adj,int node,Stack<Integer> stk,boolean[] visited){
        visited[node] = true;
        for(int it:adj.get(node)){
            if(!visited[it]) dfs(adj,it,stk,visited);
        }
        stk.push(node);
    }
    void revDFS(ArrayList<ArrayList<Integer>> adj,int node,boolean[] visited){
        visited[node] = true;
        for(int it:adj.get(node)){
            if(!visited[it]) revDFS(adj,it,visited);
        }
    }
}

//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int V = sc.nextInt();
            int E = sc.nextInt();

            List<List<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();

                adj.get(u).add(v);
            }

            Solution obj = new Solution();
            List<Integer> safeNodes = obj.eventualSafeNodes(V, adj);
            for (int i : safeNodes) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    List<Integer> eventualSafeNodes(int V, List<List<Integer>> adj) {

     

        ArrayList<Integer> list = new ArrayList<>();

        boolean visited[] = new boolean[V];
        boolean dfsvisited[] = new boolean[V];
       // boolean present[] = new boolean[n];

        for(int i=0; i<V; i++)
        {
            if(!visited[i])
             DFS(adj, i, visited, dfsvisited );
            
        }
        for(int i=0; i<V; i++)
        {
        if(!dfsvisited[i])
        list.add(i);
        }
        return list;

    }

    public boolean DFS(List<List<Integer>> adj, int s,  boolean visited[], boolean dfsvisited[] )
    {
        visited[s] = true;
        dfsvisited[s] = true;
       // present[s] = true;

        for(int j: adj.get(s))
        {
            if(!visited[j]) {
            if (DFS(adj, j,visited, dfsvisited)) return true;
            }

            else if(dfsvisited[j])
            return true;

        }
        dfsvisited[s] = false;
       // present[s] = false;
        return false;
    }
}

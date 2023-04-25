//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/

class Solution {
    
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        
        boolean visited[] = new boolean[V];
        boolean dfsvisited[] = new boolean[V];
        
        for(int i=0; i<V; i++)
        {
            if(!visited[i] && isCyclicDFS(i,adj,visited,dfsvisited))
            return true;
        }
        return false;
    }
    
    public boolean isCyclicDFS(int s, ArrayList<ArrayList<Integer>> adj, boolean visited[], boolean dfsvisited[])
    {
        visited[s] = true;
        dfsvisited[s] = true;
        
        for(int i: adj.get(s))
        {
            if(!visited[i] && isCyclicDFS(i,adj,visited,dfsvisited))
            return true;
            
            else if(dfsvisited[i] == true)
            return true;
        }
        dfsvisited[s] = false;
        return false;
    }
}
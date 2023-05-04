class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        List<List<Integer>> adj = BuildGraph(n,edges);

        boolean visited[] = new boolean[n];

        return hasPath(adj,visited,source,destination);
    }

    public boolean hasPath(List<List<Integer>> adj, boolean visited[], int src, int dest)
    {
        if (src==dest)
        return true;

        visited[src]=true;

        for(int i:adj.get(src))
        {
            if(!visited[i] && hasPath(adj,visited,i,dest))
            return true;

        }
        return false;
    }
    public List<List<Integer>> BuildGraph(int n, int[][] edges)
    {
        List<List<Integer>> adj = new ArrayList<>();

        for(int i=0; i<n; i++)
        adj.add(new ArrayList<>());

        for(int[] edge: edges)
        {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        return adj;
    }

    
}

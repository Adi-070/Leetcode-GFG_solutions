class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;

        ArrayList<Integer> list = new ArrayList<>();

        boolean visited[] = new boolean[n];
        boolean dfsvisited[] = new boolean[n];
      

        for(int i=0; i<n; i++)
        {
            if(!visited[i])
             DFS(graph, i, visited, dfsvisited );
            
        }
        for(int i=0; i<n; i++)
        {
        if(!dfsvisited[i])
        list.add(i);
        }
        return list;

    }

    public boolean DFS(int[][] graph, int s,  boolean visited[], boolean dfsvisited[] )
    {
        visited[s] = true;
        dfsvisited[s] = true;
       
        for(int j: graph[s])
        {
            if(!visited[j]) {
            if (DFS(graph, j,visited, dfsvisited)) return true;
            }

            else if(dfsvisited[j])
            return true;

        }
        dfsvisited[s] = false;
        return false;
    }
}

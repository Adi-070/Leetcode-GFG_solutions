class Solution {
    public boolean isBipartite(int[][] graph) {
        int colors[] = new int[graph.length];

        for(int i=0; i<graph.length; i++)
        {
            if(colors[i]==0 && !isValid(graph,colors,i,1))
            return false;
        }
        return true;
    }

    public boolean isValid(int[][] graph, int[] colors, int node, int curr)
    {
        if(colors[node]!=0)
        return colors[node]==curr;

        colors[node]=curr;

        for(int i: graph[node])
        {
            if (!isValid(graph,colors,i,-curr))
            return false;
        }
        return true;
    }
}

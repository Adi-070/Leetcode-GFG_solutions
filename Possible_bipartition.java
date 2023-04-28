class Solution {
    public boolean possibleBipartition(int V, int[][] graph) {
    
List<Integer>[] g = new ArrayList[V+1];

    for(int i=1; i<=V; i++)
    g[i] = new ArrayList<>();

    for(int[] pre: graph)
    {
    g[pre[0]].add(pre[1]);
    g[pre[1]].add(pre[0]);
    }
     int colors[] = new int[V+1];
        
        for(int i=1; i<=V; i++)
        {
            if (colors[i]==0 && !isValid(g,i,1,colors))
            return false;
        }
        return true;
    }
    
    public boolean isValid(List<Integer>[] g, int node, int c, int colors[])
    {
        if (colors[node]!=0 )
        return colors[node]==c;
        
        colors[node] = c;
        
        for(int i: g[node])
        {
        if(!isValid(g,i,-c,colors))
        return false;
        }
        return true;
    }
}

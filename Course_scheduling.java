class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        ArrayList<Integer>[] adj = new ArrayList[numCourses];

        for(int i=0; i<numCourses; i++)
        adj[i] = new ArrayList();

        for(int pre[]: prerequisites)
        adj[pre[0]].add(pre[1]);


        boolean visited[] = new boolean[numCourses];
        boolean dfsvisited[] = new boolean[numCourses];

        for(int i=0; i<numCourses; i++)
        {
            if( !isCyclicDFS(i,adj,visited,dfsvisited))
            return false;
        }
        return true;
    }

    public boolean isCyclicDFS(int s,ArrayList<Integer>[] adj,boolean visited[],boolean dfsvisited[])
{
    if(visited[s])
    return false;
    if(dfsvisited[s])
    return true;

    visited[s] = true;

    for(int i: adj[s]) 
    {
    if( !isCyclicDFS(i,adj,visited,dfsvisited))
    return false;

   
    }
    visited[s] = false;
    dfsvisited[s] = true;
    return true;
}
}

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
            if(!visited[i] && isCyclicDFS(i,adj,visited,dfsvisited))
            return false;
        }
        return true;
    }

    public boolean isCyclicDFS(int s,ArrayList<Integer>[] adj,boolean visited[], boolean dfsvisited[])
{
    visited[s] = true;
    dfsvisited[s] = true;

    for(int i: adj[s]) 
    {
    if(!visited[i] && isCyclicDFS(i,adj,visited,dfsvisited))
    return true;

    else if (dfsvisited[i]==true)
    return true;
    }
    dfsvisited[s] = false;
    return false;
}
}

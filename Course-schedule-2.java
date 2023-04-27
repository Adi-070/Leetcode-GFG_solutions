class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        ArrayList<Integer>[] adj = new ArrayList[numCourses];

        for(int i=0; i<numCourses; i++)
        adj[i] = new ArrayList();

        for(int pre[] : prerequisites)
        adj[pre[0]].add(pre[1]);

        Stack<Integer> stack = new Stack<>();

        boolean visited[] = new boolean[numCourses];
        boolean dfsvisited[] = new boolean[numCourses];

        for(int i=0; i<numCourses; i++)
        {
        if(!visited[i]) {

           if(dfs(i,adj,visited,dfsvisited,stack))
           return new int[0];
            }
        }

        int i=0;

        int arr[] = new int[numCourses];

        for(int j=arr.length-1;j>=0;j--){
        arr[j]=stack.pop();
    }
    return arr;
     }
     public boolean dfs(int numCourses, ArrayList<Integer>[] adj, boolean visited[], boolean dfsvisited[], Stack<Integer> stack)
     {  
       

         visited[numCourses] = true;
         dfsvisited[numCourses] = true;

         for(int i: adj[numCourses])
         {
             if(!visited[i])
             {
             if(dfs(i,adj,visited,dfsvisited,stack))

             return true;
             }
            else if (dfsvisited[i]==true)
            return true;
         }
         dfsvisited[numCourses] = false;
         stack.push(numCourses);
         return false;
     }
}

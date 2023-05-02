class Solution {
    public int minCostConnectPoints(int[][] edges) {
      ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>();

        int n = edges.length;


	   for(int i=0; i<n; i++)
	   adj.add(new ArrayList<ArrayList<Integer>>());
	   
	   for(int i=0; i<n-1; i++)
	   {
           for(int j=i+1; j<n; j++)
           {
	       int x1 = edges[i][0];
	       int y1 = edges[i][1];
	       int x2 = edges[j][0];
         int y2 = edges[j][1];

           int dist = Math.abs(Math.abs(x2-x1)+Math.abs(y2-y1));

           ArrayList<Integer> list1 = new ArrayList<>();
           ArrayList<Integer> list2 = new ArrayList<>();

           list1.add(i);
           list1.add(dist);

           list2.add(j);
           list2.add(dist);
	       
	       adj.get(i).add(list2);
	       adj.get(j).add(list1);
           }
	   }
	   
	   boolean visited[] = new boolean[n];
	   
	   PriorityQueue<Pair> q = new PriorityQueue<>();
	   
	   q.add(new Pair(0,0));
	   
	   int sum=0;
	   
	   while(!q.isEmpty())
	   {
	       Pair current = q.remove();
	       
	       int a =current.v;
	       int b =current.wt;
	       
	       if(visited[a])
	       continue;
				 
	        sum +=b;
	       visited[a]=true;
	       
	      
	       
				  ArrayList<ArrayList<Integer>> neighbour = adj.get(a);

	      
            for (ArrayList<Integer> list : neighbour) {
                // get the vertex and weight
                int vertex = list.get(0);
                int weight = list.get(1);
                // if neighbour vertex is not visited then add it in the pq
                if (visited[vertex] == false) {
                    q.add(new Pair(vertex, weight));
                }
            }
	       
	   }
	   
	   return sum;
	}
        
    
}

class Pair implements Comparable<Pair>
{
    int v;
    int wt;

    Pair (int v, int wt)
    {
        this.v=v;
        this.wt=wt;
    }

 public int compareTo(Pair that)
   {
       return this.wt-that.wt;
    }
}

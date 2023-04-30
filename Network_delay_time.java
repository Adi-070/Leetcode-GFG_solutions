class Solution {

    ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
    public int networkDelayTime(int[][] times, int n, int k) {
        for(int i=0; i<=n; i++)
        adj.add(new ArrayList<>());

        for(int[] pre: times)
        {
            int u = pre[0];
            int v = pre[1];
            int wt = pre[2];

            adj.get(u).add(new Pair(v,wt));
        }

        PriorityQueue<Pair> q = new PriorityQueue<>();
        q.add(new Pair(k,0));

        int dist[] = new int[n+1];
       
        Arrays.fill(dist,Integer.MAX_VALUE);
       
         dist[k] =0;

         while(!q.isEmpty())
         {
             Pair current = q.remove();

             int a =current.v;
             int b = current.wt;

             for(Pair element: adj.get(a))
             {
                 if(b+element.wt<dist[element.v])
                 {
                 dist[element.v] = b + element.wt;
                 q.add(new Pair(element.v, dist[element.v]));
                 }
             }
         }
         int ans =-1;

         for(int i=1; i<=n; i++)
         {
             if (dist[i]==Integer.MAX_VALUE)
             return -1;

             ans = Math.max(ans,dist[i]);
         }
         return ans;
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

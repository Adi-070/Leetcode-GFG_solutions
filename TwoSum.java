class Solution {
    public pair[] allPairs( long A[], long B[], long N, long M, long X) {
       
        HashMap<Long,Integer> map = new HashMap<Long,Integer>();
        for(int i=0;i<M;i++)
        map.put(B[i],1);
        
        
        ArrayList<pair> list = new ArrayList<>();
        
       
        Arrays.sort(A);
        
        for(int i=0;i<N;i++)
        {
            if(map.containsKey(X-A[i]))
            {
                
                 
                list.add(new pair(A[i],X-A[i]));
            }
        }
        
        pair ans[] = new pair[list.size()];
        for(int i=0;i<list.size();i++)
        ans[i] = list.get(i);
        
        return ans;
        
    }
}

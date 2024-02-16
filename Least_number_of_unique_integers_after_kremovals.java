class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        

        for(int i: arr)
        map.put(i,map.getOrDefault(i,0)+1);
 
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)-> map.get(a)-map.get(b));

        for(int i: map.keySet())
        pq.add(i);

        for(int i=0; i<k; i++)
        {   
            int num=pq.peek();
            int count = map.get(num);

            if(count==1)
            pq.remove();

            else
            map.put(num,map.get(num)-1);
        }
        return pq.size();
    }
}

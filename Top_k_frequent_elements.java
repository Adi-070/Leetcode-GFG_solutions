class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[k];
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)-> map.get(b)-map.get(a));

        for(int i:nums)
        map.put(i,map.getOrDefault(i,0)+1);

        for(int i: map.keySet())
        maxHeap.add(i);                                                 //HEAP APPROACH

        for(int i=0; i<k; i++)
        result[i]=maxHeap.poll();

        return result;
    }
}
.......................................................................................
    
    class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[k];

        List<Integer> bucket[] = new ArrayList[nums.length+1];
 

        for(int i:nums)
        map.put(i,map.getOrDefault(i,0)+1);

        for(int i: map.keySet())
        {
            int freq = map.get(i);

            if(bucket[freq]==null)
            bucket[freq] = new ArrayList();

            
            bucket[freq].add(i);
        }
        int index=0;                                                        //BUCKET SORT
        for(int i=bucket.length-1; i>=0; i--)
        {
            if(bucket[i]!=null)
            {
                for(int val: bucket[i]) {
                    result[index++]=val;
                    if(index==k)
                    return result;
                }
            }
        }
        return result;
    }
}

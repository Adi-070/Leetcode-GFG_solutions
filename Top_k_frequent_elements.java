class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[k];
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)-> map.get(b)-map.get(a));

        for(int i:nums)
        map.put(i,map.getOrDefault(i,0)+1);

        for(int i: map.keySet())
        maxHeap.add(i);

        for(int i=0; i<k; i++)
        result[i]=maxHeap.poll();

        return result;
    }
}

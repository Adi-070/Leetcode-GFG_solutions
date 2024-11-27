class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i: nums)
        map.put(i,map.getOrDefault(i,0)+1);

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> map.get(b)-map.get(a));

        for(int i: map.keySet())
        maxHeap.offer(i);

        int[] result = new int[k];

        for(int i=0; i<k; i++)
        result[i]=maxHeap.poll();


        return result;
    }
}
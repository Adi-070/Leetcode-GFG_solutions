class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[0]-a[0]);

        for(int i=0; i<nums.length; i++)
        pq.add(new int[]{nums[i],i});

        ArrayList<int[]> list = new ArrayList<>();

        for(int i=0; i<k; i++)
        list.add(pq.poll());

        Collections.sort(list, (a,b) -> a[1]-b[1]);

        int[] res = new int[k];

        int index=0;

        for(int[] a: list)
        res[index++] = a[0];

        return res;
        
    }
}

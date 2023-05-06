class Solution {
    public int findKthLargest(int[] arr , int k) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i:arr)
        list.add(i);
        
        Collections.sort(list);
        Collections.reverse(list);
        
        return list.get(k-1);
    }
}

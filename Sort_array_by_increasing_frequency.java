class Solution {
    public int[] frequencySort(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i: nums)
        map.put(i,map.getOrDefault(i,0)+1);

        for(int i: map.keySet())
        list.add(i);

        Collections.sort(list, (a,b) -> {

            if(map.get(a)==map.get(b))
            return b-a;

            else
            return map.get(a)-map.get(b);
        });

       int i=0;

       for(int a: list)
       {
           for(int j=0; j<map.get(a); j++)
           {
               nums[i++] = a;
           }
       }

       return nums;
    }
}

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        TreeMap<Integer, String> map = new TreeMap<>();

        for(int i=0; i<names.length; i++)
        {
            map.put(heights[i],names[i]);
        }
        System.out.println(map);

        ArrayList<String> list = new ArrayList();
        String[] newNames;
      
        for(int k: map.keySet())
        {
            list.add(map.get(k));
        }
        Collections.reverse(list);
        newNames = list.toArray(new String[0]);

        return newNames;
    }
}
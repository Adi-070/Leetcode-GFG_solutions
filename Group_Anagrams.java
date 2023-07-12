class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map = new HashMap<>();

        for(String x: strs)
        {
            char[] ch = x.toCharArray();
            Arrays.sort(ch);

            String s = String.valueOf(ch);

            if(!map.containsKey(s))
            map.put(s,new ArrayList<>());

            
            map.get(s).add(x);
        }
        return new ArrayList<>(map.values());
    }
}

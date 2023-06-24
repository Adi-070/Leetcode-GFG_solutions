class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a,b)-> map.get(b)-map.get(a));
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++)
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);

        

        for(char i: map.keySet())
        maxHeap.add(i);

        while(!maxHeap.isEmpty())
        {
            char c = maxHeap.poll();
            for(int i=0; i<map.get(c); i++)
            sb.append(c);
        }

        return sb.toString();
    }
}

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> list = new ArrayList<>();

        if(p.length() > s.length())
        return list;

        HashMap<Character,Integer> map1 =new HashMap<>();
        HashMap<Character,Integer> map2 =new HashMap<>();

        for(char c: p.toCharArray())
        map1.put(c,map1.getOrDefault(c,0)+1);

        for(int i=0; i<p.length(); i++) 
        map2.put(s.charAt(i),map2.getOrDefault(s.charAt(i),0)+1);

        int i=0;
        int j = p.length();
       
        while(j<s.length())
        {   
            if(map1.equals(map2))
            list.add(i);

          
            char c = s.charAt(j);
            map2.put(c,map2.getOrDefault(c,0) + 1);
        
       
            char ch = s.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0) - 1);
            

            if(map2.get(ch)<=0)
            map2.remove(ch);

            i++;
            j++;
            
        }
        if(map1.equals(map2))
        list.add(i);
   
        return list;
    }
}

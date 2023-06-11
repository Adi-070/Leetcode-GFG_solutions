class Solution {
    public char findTheDifference(String s, String t) {
        
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(int i=0; i<s.length(); i++)
        {
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
        }
        
         for(int i=0; i<t.length(); i++)
        {
            map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
        }
        // System.out.println(map2);
        // System.out.println(map1);
        
        for( char c: map2.keySet())
        {
            if(!map1.containsKey(c))
            return c;

            else if(map1.get(c)<map2.get(c))
            return c;
            
        }
        return  'a';
    }
}

........................................................................................
    
class Solution {
    public char findTheDifference(String s, String t) {
        
        char c[] = s.toCharArray();
        char d[] = t.toCharArray(); 

        Arrays.sort(c);
        Arrays.sort(d);

        for(int i=0; i<c.length; i++)
        {
            if(c[i]!=d[i])
            return d[i];
        }
        return d[d.length-1];
    }
}

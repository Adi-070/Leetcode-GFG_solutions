class Solution {
    public int firstUniqChar(String s) {
        int index = -1;
        int i;
        for( i =0; i<s.length(); i++)
        {   char c = s.charAt(i);

        int first = s.indexOf(c);
        int second = s.lastIndexOf(c);
            if (first==second)
            {
            index = i;
            break;
            }
            
            
        }
        return index;
    }
}
.......................................................................
    
    class Solution {
    public int firstUniqChar(String s) {

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++)
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);

        for(int i=0; i<s.length(); i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                if(map.get(s.charAt(i))==1)
                return i;
            }
        }
        return -1;
    }
}

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

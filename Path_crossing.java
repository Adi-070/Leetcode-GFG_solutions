class Solution {
    public boolean isPathCrossing(String path) {
        int c=0;
        int d=0;

        HashSet<String> set = new HashSet<String>();
        set.add("(0,0)");

        for(int i=0; i<path.length(); i++)
        {
            if(path.charAt(i)=='N') 
            d++;

            else if (path.charAt(i)=='S') 
            d--;

            else if (path.charAt(i)=='E')
            c++;

            else if (path.charAt(i)=='W')
            c--;  

            String x = "("+c+","+d+")";

            if(set.contains(x))
            return true;

            else
            set.add(x);
        }

        return false;
    }
}

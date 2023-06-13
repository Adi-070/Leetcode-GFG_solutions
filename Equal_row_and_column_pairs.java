class Solution {
    public int equalPairs(int[][] grid) {
        
        HashMap<String,Integer> row = new HashMap<>();
        HashMap<String,Integer> col = new HashMap<>();

        for(int i=0; i<grid.length; i++)
        {   
             StringBuilder r = new StringBuilder();
             StringBuilder c = new StringBuilder();

            for(int j=0; j<grid.length; j++)
            {
                r.append(grid[i][j]).append(" ");
                c.append(grid[j][i]).append(" ");
            }
           // System.out.println(r);
            row.put(r.toString(),row.getOrDefault(r.toString(),0)+1);
            col.put(c.toString(),col.getOrDefault(c.toString(),0)+1);
        }
        // System.out.println(row);
        // System.out.println(col);

        int c =0;

        for(String s: row.keySet())
        {
            if(col.containsKey(s))
            c += row.get(s)*col.get(s);
        }
        return c;
    }
}

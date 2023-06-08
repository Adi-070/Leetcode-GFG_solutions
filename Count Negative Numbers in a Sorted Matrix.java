class Solution {
    public int countNegatives(int[][] grid) {
        
        int m=grid.length;
        int n = grid[0].length;

        int c=0;

        int i=0;
        int j=n-1;

        while(i<m && j>=0)
        {
            if(grid[i][j]>=0)
            i++;

            else if(grid[i][j]<0)
            {   
                c+= (grid.length-i);
                j--;

            }
        }
        return c;
    }
}

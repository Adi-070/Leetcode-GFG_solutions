class Solution {
    public int numEnclaves(int[][] grid) {
        int c =0;

        for(int i=0; i<grid.length; i++)
        {
            for(int j=0; j<grid[i].length; j++)
            {
                if((i==0 || j==0 || i==grid.length-1 || j==grid[i].length-1)&&(grid[i][j]==1))

                DFS(grid,i,j);
            }
        }

        for(int i=0; i<grid.length; i++)
        {
            for(int j=0; j<grid[i].length; j++)
            {
                if(grid[i][j]==1)
                c++;
            }
        }
        return c;
    }
    public void DFS(int[][] grid, int i, int j)
    {
        if(i<0 || j<0 || i>=grid.length || j>=grid[i].length || grid[i][j] ==0)
        return;

        grid[i][j] = 0;

        DFS(grid,i+1,j);
        DFS(grid,i-1,j);
        DFS(grid,i,j+1);
        DFS(grid,i,j-1);

    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        int FreshOranges = 0;

        Queue<int[]> q = new LinkedList<>();

        for(int i=0; i<grid.length; i++)
        {
            for(int j=0; j<grid[0].length; j++)
            {   

                 if (grid[i][j]==2)
                q.add(new int[]{i,j});
                
                if (grid[i][j]==1)
                FreshOranges++;
            }
        }

        if (FreshOranges==0)
        return 0;

        int t=-1;

        while(!q.isEmpty())
        {  
            int size=q.size();
            t++;

            for(int i=0; i<size; i++)
            {
                int[] orange = q.remove();

                int row = orange[0];
                int col = orange[1];

                if(row-1>=0 && grid[row-1][col]==1)
                {
                    q.add(new int[]{row-1,col});
                    grid[row-1][col]=2;
                    FreshOranges--;
                }
                  if(row+1<grid.length && grid[row+1][col]==1)
                {
                    q.add(new int[]{row+1,col});
                    grid[row+1][col]=2;
                    FreshOranges--;
                }
                 if(col-1>=0 && grid[row][col-1]==1)
                {
                    q.add(new int[]{row,col-1});
                    grid[row][col-1]=2;
                    FreshOranges--;
                }
               
                 if(col+1<grid[0].length && grid[row][col+1]==1)
                {
                    q.add(new int[]{row,col+1});
                    grid[row][col+1]=2;
                    FreshOranges--;
                }
            }
        }
       if (FreshOranges==0)
       return t;

       return -1;
    }
}

//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.orangesRotting(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


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
       return FreshOranges==0? t :-1 ;
    }
}
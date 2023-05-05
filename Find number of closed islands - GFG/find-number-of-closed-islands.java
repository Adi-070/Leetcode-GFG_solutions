//{ Driver Code Starts
//Initial Template for Java

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
            String[] str = br.readLine().trim().split(" ");
            int N = Integer.parseInt(str[0]);
            int M = Integer.parseInt(str[1]);
            int[][] matrix = new int[N][M];
            for(int i=0; i<N; i++)
            {
                String[] s = br.readLine().trim().split(" ");
                for(int j=0; j<M; j++)
                    matrix[i][j] = Integer.parseInt(s[j]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.closedIslands(matrix, N, M));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int closedIslands(int[][] grid, int N, int M)
    {
        int c=0;

        for(int i=1; i<grid.length-1; i++)
        {
            for(int j=1; j<grid[0].length-1; j++)
            {
                if(grid[i][j]==1)
                {
                    if (travel(grid,i,j))
                    c++;
                }
            }
        }
        return c;
    }
    
     public boolean travel(int[][] grid, int i, int j)
    {
        if(grid[i][j]==0)
        return true;

        grid[i][j]=0;

        if(i==0 || j==0 || i==grid.length-1 || j==grid[0].length-1)
        return false;

       boolean one=travel(grid,i+1,j);
       boolean two=travel(grid,i-1,j);
       boolean three=travel(grid,i,j+1);
       boolean four=travel(grid,i,j-1);
       
       return (one && two && three && four);
       
    }
}
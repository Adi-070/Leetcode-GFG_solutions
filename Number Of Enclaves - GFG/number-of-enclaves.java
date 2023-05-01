//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }

            Solution ob = new Solution();
            int ans = ob.numberOfEnclaves(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    int numberOfEnclaves(int[][] grid) {

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
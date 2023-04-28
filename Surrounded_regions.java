class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
             {

            if ((i==0 || j==0 || i==m-1|| j==n-1) && board[i][j]=='O')
                DFS(board,i,j);
            }

        }

        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(board[i][j]=='O')
                board[i][j]='X';

                else if(board[i][j]=='V')
                board[i][j]='O';
            }
        }

    }

    public void DFS(char[][] board, int i, int j)
    {
        if(i<0 || j<0 || i>=board.length || j>=board[0].length|| board[i][j]=='X'|| board[i][j]=='V')

        return;

        if(board[i][j]=='O')
        board[i][j] = 'V';

        DFS(board,i-1,j);
        DFS(board,i+1,j);
        DFS(board,i,j-1);
        DFS(board,i,j+1);
    }
}

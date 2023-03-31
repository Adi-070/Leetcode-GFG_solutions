class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;

        for(int i=0;i<m;i++)
        {
            for(int j=i;j<m;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]= temp; 
            }
        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m/2;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][m-1-j];
                matrix[i][m-1-j]= temp; 
            }
        }
        
    }
}

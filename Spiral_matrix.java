
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;

        int top=0; int left=0;
        int bottom=n-1; int right=m-1;

while(top<=bottom && left<=right)
{
        for(int i=left; i<=right; i++)
        {
            list.add(matrix[top][i]);
        }
        top++;

        for(int i=top; i<=bottom; i++)
        {
            list.add(matrix[i][right]);
        }
        right--;
if(top<=bottom)
{
        for(int i=right; i>=left; i--)
        {
            list.add(matrix[bottom][i]);
        }
        bottom--;
}
if(left<=right)
{
        for(int i=bottom; i>=top; i--)
        {
            list.add(matrix[i][left]);
        }
        left++;
}
}
return list;
    }
}
.....................................................................................
class Solution {
    List<Integer> ans = new ArrayList<>();
    public List<Integer> spiralOrder(int[][] matrix) {
        helper(matrix,0,0,false);
        return ans;
    }
    public void helper(int[][] matrix, int row, int col, boolean goup)
    {
        if(row<0||col<0||row>=matrix.length||col>=matrix[0].length||matrix[row][col]==101)
        return;

        ans.add(matrix[row][col]);
        matrix[row][col]=101;

        if(goup==true)
        helper(matrix, row-1, col,true);

        helper(matrix, row, col+1,false);
        helper(matrix, row+1, col,false);
        helper(matrix, row, col-1,false);
        helper(matrix, row-1, col,true);
    }
}

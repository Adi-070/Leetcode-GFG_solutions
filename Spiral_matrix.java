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

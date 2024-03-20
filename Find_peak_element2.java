class Solution {
    public int[] findPeakGrid(int[][] mat) {
        
        int n = mat[0].length;

        int start=0;
        int end=n-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;

            int i=max(mat,mid); 

            int left=-1;
            int right=-1;

            if(mid-1>=0)
            left=mat[i][mid-1];


            if(mid+1<mat[0].length)
            right=mat[i][mid+1];


            if(mat[i][mid]>left && mat[i][mid]>right)
            return new int[]{i,mid};

            else if(mat[i][mid]<left)
            end=mid-1;

            else
            start=mid+1;

        }

    return new int[]{0,0};
        
    }
    public int max(int[][] mat, int mid)
    {
        int row=0;
        int max=0;

        for(int i=0; i<mat.length; i++)
        {
            if(mat[i][mid]>max)
            {
            max=mat[i][mid];
            row=i;
            }
        }
        return row;
    }
}

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color)
        return image;

        else

        fill(image,sr,sc,color,image[sr][sc]);
        return image;
    }

    public void fill(int[][] image, int sr, int sc, int color, int prev)
    {
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length)
        return;

        if(image[sr][sc]!=prev)
        return;

        image[sr][sc] = color;

        fill(image,sr-1,sc,color,prev);
        fill(image,sr+1,sc,color,prev);
        fill(image,sr,sc-1,color,prev);
        fill(image,sr,sc+1,color,prev);
    }
}

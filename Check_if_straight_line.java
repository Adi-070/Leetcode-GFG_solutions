class Solution {
    public boolean checkStraightLine(int[][] coordinates) {

        int x = coordinates[0][0];
        int y = coordinates[0][1];
        int x1 = coordinates[1][0];
        int y1 = coordinates[1][1];

        int dx = x1-x;
        int dy= y1-y;

        for(int i=0; i<coordinates.length; i++)
        {
            if(dx*(coordinates[i][1]-y1)!=(dy*(coordinates[i][0]-x1)))
            return false;
        }
        return true;
    }
}

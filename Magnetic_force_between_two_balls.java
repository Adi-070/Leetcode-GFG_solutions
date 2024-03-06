class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);

        int low=1;
        int high=1000000000;

        int ans=0;

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(check(mid,position,m)==true)
            {
                ans=mid;
                low=mid+1;
            }
            else
            high=mid-1;
        }
        return ans;
    }
    public boolean check(int mid, int[] position, int m) {
        int balls=1;

        int last=position[0];

        for(int i=1; i<position.length; i++)
        {
            if(position[i]-last>=mid)
            {
                last=position[i];
                balls++;
            }
        }
        if(balls>=m)
        return true;

        return false;
    }
}

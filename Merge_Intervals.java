class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a,b)-> a[0]-b[0]);

        int start = intervals[0][0];
        int end = intervals[0][1];

        int i=1; 

        ArrayList<int[]> list = new ArrayList<>();

        while(i<intervals.length)
        {
            int s=intervals[i][0];
            int e=intervals[i][1];

            if(s<=end)
            {
                end=Math.max(end,e);
            }
            else {
                list.add(new int[]{start,end});
                start=s;
                end=e;
            }
            i++;
        }
        list.add(new int[]{start,end});
        return list.toArray(new int[0][]);
    }
}

class Solution {
    public int dayOfYear(String date) {
        
        int[] numbers = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};

        String[] dates = date.split("-");

        int d = Integer.valueOf(dates[2]);
        int m = Integer.valueOf(dates[1]);
        int y = Integer.valueOf(dates[0]);

        int day=0;

        for(int i=0; i<m-1; i++)
        day = day + numbers[i];

        if(m>2)
        {
            if((y%4==0 && y%100!=0) || (y%400 == 0))
            day++;
        }
        day += d;

        return day;
    }
}

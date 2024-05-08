class Solution {
    public String[] findRelativeRanks(int[] score) {
        
        TreeMap<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());

        for(int i=0; i<score.length; i++)
        map.put(score[i],i);

        String arr[] = new String[score.length];

        int count=1;
        for(int i:map.values())
        {   
            arr[i]=count+"";

            if(count==1)
            {
                arr[i]="Gold Medal";
            }
            else if(count==2)
            {
                arr[i]="Silver Medal";
            }
              else if(count==3)
            {
                arr[i]="Bronze Medal";
            }
            count++;
        }
        return arr;
    }
}

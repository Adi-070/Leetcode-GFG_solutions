class Solution {
    public List<String> summaryRanges(int[] nums) {
       

        List<String> list = new ArrayList<>();

        if(nums.length==0)
        return list;

         
        int i=0;
        int j=1;

        while(j<nums.length)
        {
            if(nums[j]-nums[j-1]==1)
            j++;

            else {

                if(j-i==1)
                list.add(""+ nums[i]);

                else
                list.add(""+ nums[i]+"->"+nums[j-1]);
            
            i=j;
            j++;
            }  
        }
        if(j-i==1)
        list.add(""+ nums[i]);

        else
        list.add(""+ nums[i]+"->"+nums[j-1]);
            
        return list;
    }
}

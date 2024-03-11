class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        
        List<Boolean> list = new ArrayList<>();

        int i=0,j=0;

        List<Integer> res;

        while(i<l.length && j<r.length)
        {   res=new ArrayList<>();
            for(int k=l[i]; k<=r[i]; k++)
            {
                res.add(nums[k]);
            }
            if(check(res))
            list.add(true);

            else
            list.add(false);

           
            i++;
            j++;
        }
    return list;
    }
    public boolean check(List<Integer> res)
    {   
         Collections.sort(res);
         for(int f=0; f<res.size()-2;f++)
            {
                if(res.get(f+1)-res.get(f)!=res.get(f+2)-res.get(f+1))
                return false;
            }
            return true;
    }
}

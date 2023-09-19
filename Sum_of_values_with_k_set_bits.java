class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i=0; i<nums.size(); i++)
        {
            int dec = i;
            ArrayList<Integer> res = new ArrayList<>();

            while(dec>0)
            {
                res.add(dec%2);
                dec/=2;
            }
            list.add(res);
        }
        int c[] = new int[list.size()];

        for(int i=0; i<list.size(); i++)
        {
            for(int j=0; j<list.get(i).size(); j++)
            {
                if(list.get(i).get(j)==1)
                c[i]++;                                                                        //BRUTE FORCE
            }
        }
        int sum=0;

        for(int i=0; i<c.length; i++)
        {
            System.out.println(c[i]);
        }
        for(int i=0; i<c.length; i++)
        {
            if(c[i]==k)
            sum += nums.get(i);
        }

        return sum;
    }
}

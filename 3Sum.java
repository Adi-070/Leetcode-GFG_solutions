
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0; i<nums.length; i++)
        {
            if(i!=0 && nums[i]==nums[i-1])                        //OPTIMAL
            continue;

            int j=i+1;
            int k=nums.length-1;

            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];

                if(sum<0)
                {
                    j++;
                }
                else if(sum>0)
                {
                    k--;
                }
                else
                {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);

                    ans.add(temp);

                    j++;
                    k--;

                    while(j<k && nums[j]==nums[j-1])
                    j++;

                    while(j<k && nums[k]==nums[k+1])
                    k--;
                }

            }
        }
        return ans;
    }
}

..........................................................................................
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        Set<List<Integer>> set= new HashSet<>();

        for(int i=0; i<nums.length-2; i++)
        {
            int j=i+1;
            int k = nums.length-1;
                                                                                                        //BETTER
            while(j<k)
            {   
                

                if(nums[i]+nums[j]+nums[k]==0)
                {   
                    ArrayList<Integer> list = new ArrayList<>();

                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);

                    set.add(list);
                    j++;
                }
                else if (nums[i]+nums[j]+nums[k]<0)
                j++;

                else
                k--;
            }
        }
        return new ArrayList<>(set);
    }
}

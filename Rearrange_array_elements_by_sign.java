class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int i:nums)
        {
            if(i>0)
            pos.add(i);
        }
        for(int i:nums)
        {
            if(i<0)
            neg.add(i);
        }
        int index=0;
        for(int i=0,j=0; i<pos.size() && j<neg.size(); i++,j++)
        {
            nums[index++]=pos.get(i);
            nums[index++]=neg.get(j);
        }
        return nums;
    }
}
.....................................................................................

class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int num[] = new int[nums.length];

        int pos=0,neg=1;
        for(int i:nums)
        {
            if(i>0) {
            num[pos]=i;
            pos+=2;
            }
            else {
                num[neg]=i;
                neg+=2;
            }
        }
        return num;
    }
}

class Solution {
    public int findDuplicate(int[] nums) {
        
        Arrays.sort(nums);

        int low=1;
        int high=nums.length-1;


        while(low<=high)
        {
            int mid = low+(high-low)/2;
            int count=0;
           for(int i:nums)
           {
            if(i<=mid)
            count++;
           }
           if(count>mid)
           high=mid-1;

           else
           low=mid+1;

        }
        return low;
    }
}
......................................................................
class Solution {
    public int findDuplicate(int[] nums) {
       HashSet<Integer> set = new HashSet<>();

       for(int i:nums)
       {
           if (set.contains(i))
           return i;

           set.add(i);
       }
        return -1;
    }
}
.............................................................................
    
  class Solution {
    public int findDuplicate(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            
            if(map.get(nums[i])==2)
            return nums[i];
            
        }
        return -1;
    }
}

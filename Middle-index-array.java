class Solution {
    public int findMiddleIndex(int[] nums) {
        int lsum[] = new int[nums.length]; 
        int rsum[] = new int[nums.length]; 
        lsum[0]=nums[0];
        rsum[nums.length-1] = nums[nums.length-1];
        for(int i=1; i<nums.length ;i++){
            lsum[i] = lsum[i-1] + nums[i]; 
        }
        for(int i=nums.length-2; i>=0; i--){
            rsum[i] = rsum[i+1] + nums[i];
        }
        for(int i=0; i<nums.length;i++){
            if(lsum[i]==rsum[i])
            return i; 
        }
        return -1; 
    }
}

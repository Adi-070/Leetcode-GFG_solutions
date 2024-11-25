class Solution {
    public int[] leftRightDifference(int[] arr) {
        int leftSum=0;
        int rightSum=0;
        int Sum=0;

        int n=arr.length;
        
        for(int i=0; i<n; i++)
        Sum +=arr[i];
        
        rightSum=Sum;


         for(int i=0; i<n; i++)
        {   int val=arr[i];
        
            rightSum -=val;
            arr[i]=Math.abs(leftSum-rightSum);    
            leftSum +=val;
        }
        return arr;
}
}
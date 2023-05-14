class Solution {
    public int[] leftRigthDifference(int[] arr) {
        int leftSum=0;
        int rightSum=0;
        int Sum=0;

        int n=arr.length;
        
        for(int i=0; i<n; i++)
        Sum +=arr[i];
        
        rightSum=Sum;


         for(int i=0; i<n; i++)
        {
            rightSum -=arr[i];
            leftSum +=arr[i];
            arr[i]=Math.abs(leftSum-arr[i]-rightSum);    
            
        }
        return arr;
}
}

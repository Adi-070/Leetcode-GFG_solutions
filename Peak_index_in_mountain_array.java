class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i+1]<arr[i])
            return i;
        }
        return -1;
    }
}

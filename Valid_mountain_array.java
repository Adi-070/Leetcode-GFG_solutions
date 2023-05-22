class Solution {
    public boolean validMountainArray(int[] arr) {
        int i=0;
        int n = arr.length;

        while(i+1<n && arr[i]<arr[i+1])
        i++;

        if(i==0 || i==n-1)
        return false;

        while(i+1<n && arr[i]>arr[i+1])
        i++;

        if(i==n-1)
        return true;

        return false;
    }
}

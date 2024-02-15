class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(0,nums.length-1,nums);
    }
    public int merge(int start, int end, int[] arr)
    {
        int count=0;
        int mid = (start+end)/2;
        int[] temp = new int[end-start+1];
        int j=mid+1;
        int i=start;

        int k=0;

        while(i<=mid)
        {
            while(j<=end && arr[i]>2*(long)arr[j])
            j++;

            count += (j-(mid+1));
            i++;
        }
        i=start;
        j=mid+1;

        while(i<=mid && j<=end)
        {
            if(arr[i]<arr[j])
            temp[k++]=arr[i++];

            else
            temp[k++]=arr[j++];
        }

        while(i<=mid)
        temp[k++]=arr[i++];

        while(j<=end)
        temp[k++]=arr[j++];
    
    k=0;
    i=start;

    while(i<=end)
    arr[i++]=temp[k++];

    return count;
    }
    public int mergeSort(int start, int end, int[] arr)
    {
        int count=0;

        if(start<end)
        {   
            int mid=(start+end)/2;
            count+=mergeSort(start,mid,arr);
            count+=mergeSort(mid+1,end,arr);
            count+=merge(start,end,arr);
        }
        return count;
    }
}

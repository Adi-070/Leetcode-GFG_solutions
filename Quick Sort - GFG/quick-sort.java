//{ Driver Code Starts
import java.util.*;
class Sorting
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    // Driver program
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			
			new Solution().quickSort(arr,0,n-1);
			printArray(arr);
		    T--;
		}
} }
// } Driver Code Ends


class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
       if(low>=high)
       return;
       
       int part = partition(arr,low,high);
       
       quickSort(arr,low,part-1);
       quickSort(arr,part+1,high);
    }
    static int partition(int arr[], int low, int high)
    {
        int pivot = arr[low];
        
        int i=low;
        int j=high;
        
        while(i<j)
        {
            while(i<high && arr[i]<=pivot)
            i++;
            
            
            while(j>low && arr[j]>pivot)
            j--;
            
            if(i<j)
            swap(i,j,arr);
        }
        swap(low,j,arr);
        return j;
    } 
    
    static void swap(int low, int high, int[] arr)
    {
        int temp = arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
    }
}

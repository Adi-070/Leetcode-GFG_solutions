//{ Driver Code Starts
import java.util.*;

class Sorted_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            GfG obj = new GfG();
            System.out.println(obj.transitionPoint(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG {
    int transitionPoint(int arr[], int n) {
        
        if(arr.length==1)
        {
            if(arr[0]==1)
            return 0;
            
            else
            return -1;
        }
        
        for(int i=0; i<arr.length-1; i++)
        {   
            if(arr[i]==1)
            return i;
            
            if(arr[i]!=arr[i+1])
            return i+1;
        }
        return -1;
    }
}
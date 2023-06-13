//{ Driver Code Starts
import java.util.*;
class Index{
public static void main(String[] args)
 {
	 Scanner sc = new Scanner(System.in);
	 int T = sc.nextInt();
		while(T-- > 0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.findEquilibrium(a,n));
		}
}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG
{
 public static int findEquilibrium(int nums[], int n)
     {
                 int sum=0;

        for(int i=0; i<nums.length; i++)
        {
            sum += nums[i];
        }
        int leftSum=0;
        int rightSum=sum;

        for(int i=0; i<nums.length; i++)
        {
        
                
                rightSum -= nums[i];

                if(leftSum==rightSum)
                return i;

                leftSum += nums[i];
            
               
           
        }
        return -1;
     }
}
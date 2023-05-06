class Solution {
    public int majorityElement(int[] a) {
        int res=0;
        int count=1;

        int n=a.length;
        
        for(int i=1; i<n; i++)
        {
            if(a[res]==a[i])
            count++;
            
            else 
            count--;
            
            if(count==0)
            {
            count=1;
            res =i;
            }
            
        }
        
        count =0;
        
        for(int i=0; i<n; i++)
        {
            if(a[res]==a[i])
            count++;
        }
        
        if (count<=n/2)
        return -1;
        
        return a[res];
    }
}

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;

        Deque<Integer> q = new LinkedList<>();

        int ans[] = new int[n-k+1];

        int i=0;
        int j=0;

    while(j<n)
        {
        if(q.size()==0)
        q.add(nums[j]);

        else
        {
            while(q.size()>0 && q.peekLast()<nums[j])
            q.removeLast();

            q.add(nums[j]);
        }

        
            if(j-i+1<k)
            j++;

            else if(j-i+1==k)
            {
              ans[i]=q.peek();

              if(nums[i]==q.peek())
              q.removeFirst();
            
            i++;
            j++;
            }
        }
        return ans;
    }
}

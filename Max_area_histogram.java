class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int nextLeft[]=new int[n];
        int nextRight[]=new int[n];

        Stack<Integer> stk1 = new Stack<>();
       // Stack<Integer> stk2 = new Stack<>();

        for(int i = 0; i<heights.length;i++)
        {
            while(!stk1.isEmpty() && heights[stk1.peek()]>=heights[i])
            
                stk1.pop();
            
            if(stk1.isEmpty())
            nextLeft[i]=-1;

            else
            nextLeft[i]=stk1.peek();
           
            stk1.push(i);
        }
        stk1=new Stack<>();
          for(int i = heights.length-1; i>=0;i--)
        {
            while(!stk1.isEmpty() && heights[stk1.peek()]>=heights[i])
            
                stk1.pop();
            
            if(stk1.isEmpty())
            nextRight[i]=heights.length;

            else
            nextRight[i]=stk1.peek();
           
            stk1.push(i);
        }

        int Lrectangle = 0;
        for(int i=0;i<heights.length;i++)
        {
            int height = heights[i];
            int width = nextRight[i]-nextLeft[i]-1;
            int area = width * height;
            Lrectangle = Math.max(Lrectangle, area);
        }

    return Lrectangle;

    }
}

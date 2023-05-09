class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                list.add(matrix[i][j]);
            }
        }

        Collections.sort(list);
        return list.get(k-1);
    }
}

....................................................................................
    
 class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->Integer.compare(b,a));

        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                maxHeap.add(matrix[i][j]);

                if(maxHeap.size()>k)
                maxHeap.remove();
            }
        }

    return maxHeap.peek();
    }
}

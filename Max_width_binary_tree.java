class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        LinkedList<pair> q = new LinkedList<>();

        int max = Integer.MIN_VALUE;

        if(root==null) return 0;

        q.addLast(new pair(root,0));

        while(!q.isEmpty())
        {
            int size = q.size();
            max = Math.max(max, (q.getLast().level - q.getFirst().level +1));

            for(int i=0;i<size;i++)
            {
                pair element = q.removeFirst();

                if(element.root.left!=null)
                q.addLast(new pair(element.root.left,2*element.level));

                if(element.root.right!=null)
                q.addLast(new pair(element.root.right,2*element.level+1));
            }
        }
return max;

    }


static class pair {
    int level;
    TreeNode root;
    public pair(TreeNode root, int level)
    {
        this.level=level;
        this.root=root;
    }
}
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();

       int level =0;
       int minlevel=0;
       int max = Integer.MIN_VALUE;

        if(root==null)
        return 0;

        q.add(root);

        while(!q.isEmpty())
        {
            int size=q.size();
            level++;
            
            int sum=0;

            for(int i=0;i<size;i++)
            {
            TreeNode node = q.remove();

            sum +=node.val;

            if(node.left!=null)
            q.add(node.left);

            if(node.right!=null)
            q.add(node.right);
            }
            if(sum>max)
            {
                max = sum;
                minlevel = level;
            }
        }
        return minlevel;
    }
}

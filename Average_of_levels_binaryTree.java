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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        if(root==null)
        return result;

        

        while(!q.isEmpty())
        {
            
            int size = q.size();
            long sum=0,count=0;
            
           List<Integer> list = new ArrayList<>();
            for(int i=0; i<size; i++)
            {   
                
                TreeNode node = q.remove();
                sum += node.val;
                count++;

                if(node.left!=null)
                q.add(node.left);

                if(node.right!=null)
                q.add(node.right);
            }
            result.add(sum * 1.0 / count);
        }
        return result;
    }
}

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
    public int findBottomLeftValue(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
    
        q.add(root);

        int res=0;

        

        while(!q.isEmpty())
        {
            
            int size = q.size();
            
           List<Integer> list = new ArrayList<>();
            for(int i=0; i<size; i++)
            {   
                
                TreeNode node = q.remove();
                if(i==0)
                res = node.val;

                if(node.left!=null)
                q.add(node.left);

                if(node.right!=null)
                q.add(node.right);
            }
          
        }
        return res;
    }
}

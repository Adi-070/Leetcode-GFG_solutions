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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root)  {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        int dist =0;
        q.add(root);

        if(root==null)
        return result;

        

        while(!q.isEmpty())
        {
            
            int size = q.size();
            
           List<Integer> list = new ArrayList<>();
            for(int i=0; i<size; i++)
            {   
                
                TreeNode node = q.remove();
                list.add(node.val);

                if(node.left!=null)
                q.add(node.left);

                if(node.right!=null)
                q.add(node.right);
            }
            //if (list.isEmpty()) break;
            if (dist % 2 == 1) Collections.reverse(list);
            result.add(list);
            dist++;
        }
        return result;
    }
}

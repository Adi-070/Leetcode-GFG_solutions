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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        Stack<List<Integer>> stack =new Stack();

        if(root==null)
        return result;

        q.add(root);
        
        while(!q.isEmpty())
        {
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<size;i++)
            {   
                TreeNode node = q.remove();
                list.add(node.val);

                if(node.left!=null)
                q.add(node.left);

                if(node.right!=null)
                q.add(node.right);
            }
            stack.push(list);

        }
        while(!stack.isEmpty())
        result.add(stack.pop());

        return result;

    }
}

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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack();

        stack.push(root);

        while(!stack.isEmpty())
        {
            TreeNode curr = stack.peek();
            stack.pop();

            if(curr!=null)
            {
                list.add(curr.val);
                stack.push(curr.right);
                stack.push(curr.left);
            }
        }

        return list;
}
}

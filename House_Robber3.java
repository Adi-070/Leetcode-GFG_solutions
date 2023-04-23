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
    public int rob(TreeNode root) {

        int sum =0;

        if(root==null) return 0;                                        // TLE

        if(root.left!=null)
        sum += rob(root.left.left) + rob(root.left.right);

        if(root.right!=null)
        sum += rob(root.right.left) + rob(root.right.right);

        return Math.max(sum + root.val, rob(root.left) + rob(root.right));
    }
}

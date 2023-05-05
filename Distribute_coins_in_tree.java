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

    int steps=0;
    public int distributeCoins(TreeNode root) {

        traverse(root);
        return steps;
    }

    public int traverse(TreeNode root)
    {
        if(root==null)
        return 0;

        int left = traverse(root.left);
        int right = traverse(root.right);

        steps += Math.abs(left) + Math.abs(right);

        return left+right+root.val-1;
    }
}

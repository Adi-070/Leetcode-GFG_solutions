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
    public int sumRootToLeaf(TreeNode root) {
        return helper(root, 0);
        
    }
    public int helper(TreeNode root, int sum)
    {
        if (root==null)
        return 0;

        sum = (sum*2) + root.val;
        if(root.left==null && root.right==null)
        return sum;

        return helper(root.left, sum) + helper(root.right, sum);
    }
}

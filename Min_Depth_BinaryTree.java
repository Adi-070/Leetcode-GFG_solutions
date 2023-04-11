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
    public int minDepth(TreeNode root) {
        if(root==null)
        return 0;

        
        if(root.left==null && root.right == null)
        return 1;

        int c1 = minDepth(root.left);
        int c2 = minDepth(root.right);

        if(root.left==null)
        return 1+c2;

        if(root.right==null)
        return 1+c1;


        return Math.min(c1,c2)+1;
    }
}

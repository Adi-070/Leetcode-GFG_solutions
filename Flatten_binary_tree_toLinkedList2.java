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
    TreeNode prev = null;
    public void flatten(TreeNode root) {

        if(root==null)
        return;

        TreeNode right = root.right;
        TreeNode left = root.left;

        flatten(right);
        flatten(left);

        root.left=null;
        root.right=prev;
        prev=root;



    }
}

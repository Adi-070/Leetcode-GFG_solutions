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

    int res = 0;
    public int findTilt(TreeNode root) {
        sum(root);
        return res;
        
 }
    public int sum(TreeNode root) {
        
        if(root==null)
        return 0;

        int l = sum(root.left);
        int r = sum(root.right);

        res += Math.abs(l-r);

        return root.val+ l + r;
    }
}

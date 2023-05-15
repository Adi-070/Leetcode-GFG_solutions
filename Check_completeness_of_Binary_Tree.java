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
    public boolean isCompleteTree(TreeNode root) {
        
        return Complete(root,0,count(root));
    }
    public boolean Complete(TreeNode root, int i, int n)
    {   
        if(root==null)
        return true;

        if(i>=n)
        return false;

        return Complete(root.left,2*i+1,n) && Complete(root.right,2*i+2,n);
    }
   public int count(TreeNode root)
    {
        if(root==null)
        return 0;

        return 1 + count(root.left) + count(root.right);
    }
}

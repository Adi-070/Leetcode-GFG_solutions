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
    public boolean isValidBST(TreeNode root) {
        return helper(root,null,null);

        
    }
    public boolean helper(TreeNode root, TreeNode low, TreeNode high)
    {
        if(root==null)
        return true;

        if(low!=null && root.val<=low.val)
        return false;

        if(high!=null && root.val>=high.val)
        return false;


        return helper(root.left,low,root) && helper(root.right,root,high);
    }
}
..................................................................................................
    
    
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
    public boolean isValidBST(TreeNode root) {
       long min = Long.MIN_VALUE;
        long max = Long.MAX_VALUE;
        
        return helper(root,min,max);
    }
    
    boolean helper(TreeNode root, long low, long high)
    {
        if(root==null)
        return true;
        
        if(root.val<=low || root.val>=high)
        return false;
        
        
        return helper(root.left,low,root.val) && helper(root.right,root.val,high);
    }
}

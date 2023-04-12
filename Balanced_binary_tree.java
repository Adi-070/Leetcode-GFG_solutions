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
    public boolean isBalanced(TreeNode root) {

    return (maxDepth(root)!=-1);   
    
    }
    public int maxDepth(TreeNode root) {
        if(root==null)
        return 0;

        int count = maxDepth(root.left);
        if(count==-1) return -1;
        int count1 = maxDepth(root.right);
       if(count1==-1) return -1;

        if (Math.abs(count-count1)>1)
        return -1;

        return 1+ Math.max(count,count1);
    }
}

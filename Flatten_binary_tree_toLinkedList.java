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
    public void flatten(TreeNode root) {
        if(root==null)
        return;

        TreeNode LeftTree = root.left;
        TreeNode RightTree = root.right;

        root.left=null;

        flatten(LeftTree);
        flatten(RightTree);

        root.right = LeftTree;

        TreeNode current = root;

        while(current.right!=null)
        
            current=current.right;
            current.right = RightTree;
        
    }
}

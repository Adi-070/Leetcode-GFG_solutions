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
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;
 
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
 
        root.left = right;
        root.right = left;
 
        return root;
    }
}
....................................................
    
    
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
    public TreeNode invertTree(TreeNode root) {
       
        if(root==null)
        return root;

        helper(root);
        return root;
    }
    public void helper(TreeNode root)
    {

        
        TreeNode temp = root.left;
        root.left = root.right;
        root.right=temp;
        
        if(root.left!=null)
        helper(root.left);

        if(root.right!=null)
        helper(root.right);
    }
}

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
    int sum=0;
    int count =0;
    int level=0;
    public int averageOfSubtree(TreeNode root) {
        average(root);
        return level;
    }
    public void preorder(TreeNode root)
    {
        if(root==null)
        return ;

        sum += root.val;
        count++;


        preorder(root.left);
        preorder(root.right);
    }
    public void average(TreeNode root)
    {
         if(root==null)
         return;

         preorder(root);
         if(sum/count==root.val)
         level++;

         sum=0;
        count=0;

         average(root.left);
         average(root.right);
    }
}

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
    public int min1 = Integer.MAX_VALUE;
    public int min2 = Integer.MAX_VALUE;
    boolean flag = false;
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null) return -1;
        dfs(root);

        if(flag) return min2;

        return -1;
    }
    public void dfs(TreeNode root)
    {   
        if(root==null) return;

        if(root.val<min1)
        min1=root.val;

        else if(root.val>min1 && root.val<=min2)
        {
        min2=root.val;
        flag=true;
        }
        dfs(root.left);
        dfs(root.right);    
    }
}

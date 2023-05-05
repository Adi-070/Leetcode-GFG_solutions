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
    public int deepestLeavesSum(TreeNode root) {
        int dep = maxDepth(root);
        return LeavesSum(root,dep,1,0);
    }
    public int maxDepth(TreeNode root)
    {
        if(root==null) return 0;

        return Math.max(maxDepth(root.left),maxDepth(root.right)) +1;
    }
    public int LeavesSum(TreeNode root, int dep, int level, int sum)
    {
        if(root==null)
        return 0;

        if(level==dep)
        {
            sum += root.val;
            return sum;
        }
        return LeavesSum(root.left, dep, level+1, sum ) + LeavesSum(root.right, dep, level+1, sum );
    }
}

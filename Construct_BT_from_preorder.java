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
    int index=0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return createBST(preorder,Integer.MAX_VALUE);
    }
    public TreeNode createBST(int[] nums, int ub)
    {
        if(index>nums.length-1 || nums[index]>ub)
        return null;

        int val=nums[index++];
        TreeNode root = new TreeNode(val);

        root.left=createBST(nums, val);
        root.right=createBST(nums,ub);

        return root;
    }
}

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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int index =0;

        if(nums.length<1)
        return null;

        int max = nums[0];

        for(int i=1; i<nums.length;i++)
        {
            if(max<nums[i])
            {
            max=nums[i];
            index = i;
            }
        }

        TreeNode root = new TreeNode(max);

        root.left = constructMaximumBinaryTree(Arrays.copyOfRange(nums,0,index));
        root.right = constructMaximumBinaryTree(Arrays.copyOfRange(nums,index+1,nums.length));
        return root;

    }
}

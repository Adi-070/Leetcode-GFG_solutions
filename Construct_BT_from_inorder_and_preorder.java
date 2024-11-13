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
    int Preorder[], Inorder[];
    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder==null || inorder==null)
        return null;

        Preorder=preorder;
        Inorder=inorder;

        for(int i=0; i<inorder.length; i++)
        map.put(inorder[i],i);

        return helper(0,inorder.length-1);
    }
    public TreeNode helper(int start, int end)
    {
        if(start>end)
        return null;

        int val=Preorder[index++];
        TreeNode root=new TreeNode(val);

        int mid=map.get(val);

        root.left=helper(start,mid-1);
        root.right=helper(mid+1,end);

        return root;
    }
}

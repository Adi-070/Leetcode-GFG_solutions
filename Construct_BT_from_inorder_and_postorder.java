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
    int index =0;
    Map<Integer, Integer> map = new HashMap<>();
    int Preorder[];
    int Inorder[];

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder==null || inorder==null)
        return null;

        Preorder=preorder;
        Inorder=inorder;

        for(int i=0;i<preorder.length;i++)
         map.put(Inorder[i],i);

        return dfs(0,inorder.length-1);
    }
    public TreeNode dfs(int start, int end)
    {
        if(start>end)
        return null;

        int val = Preorder[index++];
        TreeNode root = new TreeNode(val);

        int mid = map.get(val);

        root.left = dfs(start,mid-1);
        root.right = dfs(mid+1,end);

        return root;

    }
}

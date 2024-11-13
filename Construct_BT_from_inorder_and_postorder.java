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
    int index;
    int Postorder[], Inorder[];
    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(postorder==null || inorder==null)
        return null;
        index=inorder.length-1;

        Postorder=postorder;
        Inorder=inorder;

        for(int i=0; i<inorder.length; i++)
        map.put(inorder[i],i);

        return helper(0,inorder.length-1);
    }
      public TreeNode helper(int start, int end)
    {
        if(start>end)
        return null;

        int val=Postorder[index--];
        TreeNode root=new TreeNode(val);

        int mid=map.get(val);
        
        root.right=helper(mid+1,end);
        root.left=helper(start,mid-1);
        

        return root;
    }
}

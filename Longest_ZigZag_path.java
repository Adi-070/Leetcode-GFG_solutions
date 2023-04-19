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

    int pathlen=0;

  
    public void dfs(TreeNode root, boolean dir, int steps )
    {   
        if(root==null)
        return;
        
        pathlen = Math.max(pathlen,steps);

        if(dir)
        {
            dfs(root.left, false, steps+1);
            dfs(root.right,true,1);
        }
        else
        {
            dfs(root.left,false,1);
            dfs(root.right,true,steps+1);
        }
    }
      public int longestZigZag(TreeNode root) {
        dfs(root,false,0);
        dfs(root,true,0);

        return pathlen;
    }
}

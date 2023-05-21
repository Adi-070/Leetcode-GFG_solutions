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
    public boolean findTarget(TreeNode root, int k) {
        
        if(root==null)
        return false;

        TreeNode start = root;                                                                              //BRUTE_FORCE - O(n^2)
        TreeNode end = root;
        while (start.left != null) {
            start = start.left;
        }
        while (end.right != null) {
            end = end.right;
        }

        while(start!=end)
        {
            if(start.val+end.val==k)
            return true;

            else if(start.val+end.val<k)
            pred(root,start);

            else
            succ(root,end);
        }
        return false;
    }
    public TreeNode pred(TreeNode root, TreeNode node)
    {
        TreeNode prev=null;
        TreeNode curr=root;

    while(curr!=null)
    { 
        if(curr.val>node.val)
        {
            prev=curr;
            curr=curr.left;
        }
        else
            curr=curr.right;
    }
        return prev;
    }
    public TreeNode succ(TreeNode root, TreeNode node)
    {
        TreeNode succ=null;
        TreeNode curr=root;

      while(curr!=null)
      {  
        if(curr.val<node.val)
        {
            succ=curr;
            curr=curr.right;
        }
        else
        curr=curr.left;
      }
        return succ;
    }
}

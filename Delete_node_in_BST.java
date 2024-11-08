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
    public TreeNode deleteNode(TreeNode root, int key) {
   

        if(root==null)
        return null;

        if(root.val==key)
        return helper(root);

     TreeNode temp = root;

        while(root!=null)
        {
            if(key<root.val)
            {
                if(root.left!=null && root.left.val==key)
                {
                    root.left=helper(root.left);
                    break;
                }
                else{
                    root=root.left;
                }
            }
            else{
                 if(root.right!=null && root.right.val==key)
                {
                    root.right=helper(root.right);
                    break;
                }
                else{
                    root=root.right;
                }
            }
        }
        return temp;
    }
    public TreeNode helper(TreeNode root)
    {
        if(root.left==null)
        return root.right;

        else if(root.right==null)
        return root.left;

        TreeNode rightChild = root.right;
        TreeNode lastRight = findLastRight(root.left);
        lastRight.right=rightChild;
        return root.left;
    }
    public TreeNode findLastRight(TreeNode root)
    {
        if(root.right==null)
        return root;

        return findLastRight(root.right);
    }
}
............................................................................................
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)
        return null;

        else if(key<root.val)
        root.left=deleteNode(root.left,key);

        else if(key>root.val)
        root.right=deleteNode(root.right,key);

        else{
            if(root.left==null) return root.right;
            if(root.right==null) return root.left;
        
        root.val=minvalue(root.right);

        root.right=deleteNode(root.right,root.val);
        }
        return root;
    }
    public int minvalue(TreeNode root)
    {
        int min=root.val;

        while(root.left!=null)
        {
            min=root.left.val;
            root=root.left;
        }
        return min;
    }
}

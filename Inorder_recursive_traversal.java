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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root,list);
        return list;
    }
    public void inorder(TreeNode root, ArrayList<Integer> l)
    {
        if(root!=null)
        {
            inorder(root.left, l);
            l.add(root.val);
            inorder(root.right, l);
        }
    }
}

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
    public TreeNode increasingBST(TreeNode root) {
    List<Integer> list = new ArrayList();
    inorder(root,list);
    TreeNode tree = new TreeNode(0);
    TreeNode curr = tree;

    for(int v: list)
    {
        curr.right = new TreeNode(v);
        curr = curr.right;
    }
       return tree.right; 
    }

    public void inorder(TreeNode root, List<Integer> vals) {
        if (root == null) return;
        inorder(root.left, vals);
        vals.add(root.val);
        inorder(root.right, vals);
    }
}

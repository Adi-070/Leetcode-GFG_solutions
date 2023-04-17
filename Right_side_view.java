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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>list = new ArrayList();
        recursion(root,list,0);
        return list;
    }
    public void recursion (TreeNode root, List<Integer> list, int depth) {
        if (root==null)
        return;

        if(depth==list.size())
        list.add(root.val);

        recursion(root.right,list,depth+1);
        recursion(root.left,list,depth+1);


    }
}

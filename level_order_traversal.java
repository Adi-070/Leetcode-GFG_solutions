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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> a = new ArrayList<>();
        levelOrder(root,0,a);
        return a;
    }

    public void levelOrder(TreeNode root, int depth, List<List<Integer>> a)
    {
        if(root==null)
        return ;

        if(depth>=a.size())
        a.add(new ArrayList<>());

        a.get(depth).add(root.val);

        levelOrder(root.left, depth+1, a);
        levelOrder(root.right, depth+1, a);
    }
}

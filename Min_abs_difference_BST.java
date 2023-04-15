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
    public int getMinimumDifference(TreeNode root) {
        int min=Integer.MAX_VALUE;

        ArrayList<Integer> list = new ArrayList<>();
        inorder(root,list);

        for(int i=1; i<list.size();i++)
        {
            min = Math.min(min, list.get(i)-list.get(i-1));
        }
        return min;
    }
    public void inorder(TreeNode root, ArrayList<Integer> l)
    {
         if(root!=null)
        {
            inorder(root.left, l);
            l.add(root.val);
            inorder(root.right, l);
        }
        return;
    }
}

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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root,list);

        if(k>list.size())
        return -1;

        return list.get(k-1);
        
    }
    public void inorder(TreeNode root, ArrayList<Integer> list)
    {
       
        if(root!=null)
        {
            inorder(root.left,list);
            list.add(root.val);
            inorder(root.right,list);
        }
    }
}

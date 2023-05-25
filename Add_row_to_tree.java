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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        
        Queue<TreeNode> q = new LinkedList<>();

        if(depth==1)
        {
            TreeNode newRoot= new TreeNode(val);
            newRoot.left=root;

            return newRoot;

        }

        q.add(root);

        int level=1;

        while(!q.isEmpty() && level<depth)
        {
            int size=q.size();
            level++;

            for(int i=0; i<size; i++)
            {
                TreeNode node = q.remove();

                if(level==depth)
                {
                    TreeNode newLeft=new TreeNode(val);
                    TreeNode newRight = new TreeNode(val);
                    TreeNode oldLeft = node.left;
                    TreeNode oldRight = node.right;
                    node.left=newLeft;
                    node.right=newRight;
                    newLeft.left=oldLeft;
                    newRight.right=oldRight;
                }
                else
                {
                    if(node.left!=null)
                    q.add(node.left);

                    if(node.right!=null)
                    q.add(node.right);
                }
            }
        }
        return root;
    }
}

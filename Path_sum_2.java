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
    public List<List<Integer>> helper(TreeNode root, int targetSum, List<Integer> list,     List<List<Integer>> result ) {

        if(root==null)
        return result;

        list.add(root.val);

        if(root.val==targetSum && root.left==null && root.right==null)
        result.add(new ArrayList<>(list));

        helper(root.left,targetSum-root.val,list,result);
        helper(root.right,targetSum-root.val,list,result);

        if(list.size()!=0)
        list.remove(list.size()-1);

        return result;
    }
     public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> list = new ArrayList<>();

       List<List<Integer>> result = new ArrayList<>();

       return helper(root,targetSum,list,result);

        
    }
}

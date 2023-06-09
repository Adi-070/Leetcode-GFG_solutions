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

    HashMap<Integer,Integer> map ;
    int max;

    public int[] findFrequentTreeSum(TreeNode root) {
        max =0;
        map = new HashMap<>();

        dfs(root);

        ArrayList<Integer> list = new ArrayList<>();

        for(int i:map.keySet())
        {
            if(map.get(i)==max)
            list.add(i);
        }

        int[] res = new int[list.size()];

        for(int i=0; i<list.size(); i++)
        {
            res[i] = list.get(i);
        }
        return res;
    }
    public int dfs(TreeNode root)
    {   
        int sum=0;

        if(root==null)
        return 0;

        int left = dfs(root.left);
        int right = dfs(root.right);

        sum=root.val+left+right;

        int count = map.getOrDefault(sum,0)+1;

        map.put(sum,count);

        max=Math.max(max,count);

        return sum;
    }

}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode, TreeNode> map = new HashMap<>();
        HashMap<TreeNode, Boolean> visited = new HashMap<>();
        addParent(root,map,target);

        Queue<TreeNode> q = new LinkedList<>();

        q.add(target);
        visited.put(target,true);

        int dist=0;
        while(!q.isEmpty())
        {
            int size=q.size();

            if(dist==k) break;
            dist++;
            for(int i=0; i<size; i++)
            {
                TreeNode current=q.remove();

                if(current.left!=null && visited.get(current.left)==null)
                {
                    q.add(current.left);
                    visited.put(current.left,true);
                }
                if(current.right!=null && visited.get(current.right)==null)
                {
                    q.add(current.right);
                    visited.put(current.right,true);
                }
                if(map.get(current)!=null && visited.get(map.get(current))==null)
                {
                    q.add(map.get(current));
                    visited.put(map.get(current),true);
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        while(!q.isEmpty())
        {
            TreeNode cur = q.remove();
            list.add(cur.val);
        }

        return list;

    }
    public void addParent(TreeNode root, HashMap<TreeNode, TreeNode> map, TreeNode target)
    {
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty())
        {
            int size=q.size();

            // for(int i=0; i<size; i++)
            // {   
                TreeNode k = q.remove();

                if(k.left!=null)
                {
                    q.add(k.left);
                    map.put(k.left,k);
                }
                 if(k.right!=null)
                {
                    q.add(k.right);
                    map.put(k.right,k);
                }
            // }
        }
    }

}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)
        return "";

        Queue<TreeNode> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        q.add(root);

        while(!q.isEmpty())
        {
           int size=q.size();
           for(int i=0; i<size; i++)
           {
                TreeNode current = q.remove();

                if(current==null){
                sb.append("n ");
                continue;
                }
                sb.append(current.val+ " ");

                q.add(current.left);
                q.add(current.right);
        }
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data =="")
        return null;

        String[] values = data.split(" ");

        Queue<TreeNode> q = new LinkedList<>();

        TreeNode root = new TreeNode(Integer.parseInt(values[0]));

        q.add(root);

        while(!q.isEmpty())
        {
            for(int i=1; i<values.length; i++)
            {
                TreeNode current = q.remove();

                if(!values[i].equals("n"))
                {
                    TreeNode left = new TreeNode(Integer.parseInt(values[i]));
                    current.left=left;
                    q.add(left);
                }

                   if(!values[++i].equals("n"))
                {
                    TreeNode right = new TreeNode(Integer.parseInt(values[i]));
                    current.right=right;
                    q.add(right);
                }
            }
        }
         return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));

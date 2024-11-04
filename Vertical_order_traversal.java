class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Queue<Tuple> q = new LinkedList<>();
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();

        q.add(new Tuple(0, 0, root));  // Corrected order of arguments

        while (!q.isEmpty()) {
            Tuple entry = q.remove();

            int x = entry.row;
            int y = entry.col;
            TreeNode node = entry.node;

            if (!map.containsKey(y))
                map.put(y, new TreeMap<>());

            if (!map.get(y).containsKey(x))
                map.get(y).put(x, new PriorityQueue<>());

            map.get(y).get(x).add(node.val);

            if (node.left != null)
                q.add(new Tuple(x + 1, y - 1, node.left));  // Corrected order of arguments

            if (node.right != null)
                q.add(new Tuple(x + 1, y + 1, node.right));  // Corrected order of arguments
        }

        List<List<Integer>> list = new ArrayList<>();

        for (TreeMap<Integer, PriorityQueue<Integer>> mp : map.values()) {
            list.add(new ArrayList<>());
            for (PriorityQueue<Integer> nodes : mp.values()) {
                while (!nodes.isEmpty())
                    list.get(list.size() - 1).add(nodes.remove());
            }
        }
        return list;
    }
}

class Tuple {
    int row;
    int col;
    TreeNode node;

    public Tuple(int row, int col, TreeNode node) {
        this.node = node;
        this.row = row;
        this.col = col;
    }
}

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
  public Node copyRandomList(Node head) {
    if (head == null)
      return null;
    if (map.containsKey(head))
      return map.get(head);

    Node newNode = new Node(head.val);
    map.put(head, newNode);
    newNode.next = copyRandomList(head.next);
    newNode.random = copyRandomList(head.random);
    return newNode;
  }

  private Map<Node, Node> map = new HashMap<>();
}
................................................................................
    
    
    /*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        //Approach: Using HashMap, T.C:O(n), S.C:O(n)
        if(head==null) return null;
        // Create a HashMap to store the mapping between original nodes and copy nodes
        HashMap<Node, Node> map = new HashMap<>();

        //Iterate through the original linked list to create copy nodes and store the mapping
        Node curr = head;
        while(curr!=null){
            //make a new copy node                                                       >>>>>>>>>>>>>>>>>>>  EASY TO UNDERSTAND
            Node copy = new Node(curr.val);
            //add the copy node in map
            map.put(curr, copy);
            //move the curr
            curr = curr.next;
        }
        //Set the next and random pointers of the copy nodes based on the mapping
        curr = head;
        //traverse through the LinkedList
        while(curr!=null){
            Node copy = map.get(curr);
            copy.next = map.get(curr.next);
            copy.random = map.get(curr.random);

            //move the curr
            curr = curr.next;
        }
        // Return the head of the copy linked list
        return map.get(head);
    }
}

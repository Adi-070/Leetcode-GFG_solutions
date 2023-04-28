//{ Driver Code Starts
import java.util.*;

import java.io.*;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

  public class ReorderList {
    Node head; // head of lisl
    Node last; // last of linked list

    /* Linked list Node*/

    /* Utility functions */

    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;
            last = head;
        } else {
            // Node temp = head;
            // while (temp.next != null) temp = temp.next;

            last.next = node;
            last = last.next;
        }
    }
    /* Function to print linked list */
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Drier program to test above functions */
    public static void main(String args[])throws IOException {

        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t > 0) {
            int n = Integer.parseInt(in.readLine());
            ReorderList llist = new ReorderList();

            String s[]=in.readLine().trim().split(" ");
            int a1 = Integer.parseInt(s[0]);
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = Integer.parseInt(s[i]);
                llist.addToTheLast(new Node(a));
            }

            new Solution().reorderlist(llist.head);

            llist.printList();

            t--;
        }
    }
}
// } Driver Code Ends


/* Following is the Linked list node structure */

/*class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public void reorderlist(Node head) {
        if(head==null || head.next == null)
        return;

        Node mid = middleNode(head);

        Node hf = head;
        Node hs = reverseList(mid);

        while(hf!=null && hs!=null)
        {
            Node temp1 = hf.next;
            hf.next = hs;
            hf = temp1;
            
            temp1 = hs.next;
            hs.next = hf;
            hs = temp1;

        }
        if(hf!=null)
        hf.next = null;
    }
    public Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;
        
        while (fast !=null && fast.next!=null)
        {
            slow= slow.next;
            fast= fast.next.next;
        }
        return slow;
    }
    public Node reverseList(Node head) {
        Node prev = null;  
        Node current = head;
    
        
        while(current != null) { 
            Node next = current.next; 
            current.next = prev;
            prev = current;
            current = next;
        }
       return prev; 
    }
}

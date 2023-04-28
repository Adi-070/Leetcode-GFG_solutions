//{ Driver Code Starts
import java.util.*;
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
} 

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            int a = sc.nextInt();
            Node head = new Node(a);
            Node tail = head;
            
            for (int i=0; i<n-1; i++)
            {
                a = sc.nextInt();
                tail.next = new Node(a);
                tail = tail.next;
            }
            
            int k = sc.nextInt();
            
            Solution ob = new Solution();
            head = ob.rotate(head,k);
            printList(head);
        }
    }
    
    public static void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }
}

// } Driver Code Ends


/* node of linked list:

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

*/

class Solution{
    int c=0;
    public Node rotate(Node head, int k) {
        
        
        Node temp = head;
        
        while(temp.next!=null)
        {
            temp=temp.next;
            c++;
        }
        
        if(head==null || head.next==null)
        return head;
        
        Node dummy = new Node(0);
        dummy.next=head;
        
        Node slow=dummy;
        Node fast = dummy;
        
        int i;
        
        for(i=0;fast.next!=null;i++)
        fast=fast.next;
        
        for(int j=i-(c+1-k)%i; j>0; j--)
        slow=slow.next;
        
        fast.next=dummy.next;
        dummy.next=slow.next;
        slow.next=null;
        
        return dummy.next;
    }
}

//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node l1, Node l2){
        Node l3 = new Node(0);
        Node head = l3;

        int carry=0;
        
        l1=reverseList(l1);
        l2=reverseList(l2);

        while(l1!=null && l2!=null)
        {
            int value=l1.data+l2.data+carry;
            carry=value/10;
            l3.next= new Node(value%10);
            l1=l1.next;
            l2=l2.next;
            l3=l3.next;
        }
        while(l1!=null)
        {
            int value=l1.data+carry;
            carry=value/10;
            l3.next= new Node(value%10);
            l1=l1.next;
            l3=l3.next;
        }
        while(l2!=null)
        {
            int value=l2.data+carry;
            carry=value/10;
            l3.next= new Node(value%10);
            l2=l2.next;
            l3=l3.next;
        }
        if(carry!=0)
        l3.next = new Node(carry);

        return reverseList(head.next);
    }
      static Node reverseList(Node head)
    {
       
        Node prev=null;
        Node curr=head;
        Node next;
        
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        head=prev;
        return prev;
    }
}
...............

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
class Zeroes{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Node head=null;
            Node curr=null;
            while(n-->0){
                int a=sc.nextInt();
                if(head==null){
                    head=new Node(a);
                    curr=head;
                }
                else{
                    Node temp=new Node(a);
                    temp.next=null;
                    curr.next=temp;
                    curr=temp;
                }
            }
            GfG g=new GfG();
            head = g.moveZeroes(head);
            while(head!=null){
                System.out.print(head.data+" ");
                head=head.next;
            }
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

/*
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
*/

class GfG{
    public Node moveZeroes(Node head){
       
       
        if(head==null || head.next==null)
        return head;
       
        Node zero = new Node(0);
        Node curr1=zero;
        
        Node nonZero = new Node(0);
        Node curr2=nonZero;
        
        Node temp=head;
        
        while(temp!=null)
        {
            if(temp.data==0)
            {
                curr1.next=temp;
                curr1=curr1.next;
            }
            else
            {
                curr2.next=temp;
                curr2=curr2.next;
            }
            temp=temp.next;
        }
        curr2.next=null;
        curr1.next=nonZero.next;
        return zero.next;
        
    }
}
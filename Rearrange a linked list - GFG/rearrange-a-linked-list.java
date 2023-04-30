//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            new Solution().rearrangeEvenOdd(head);
            printList(head); 
            t--;
        }
    } 
} 

// } Driver Code Ends


/*

class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
This is method only submission.
You only need to complete the below method.
*/
class Solution
{

  
    void rearrangeEvenOdd(Node head)
    {     
     if(head==null || head.next == null){
    // 0 or 1 node
    return;
  }
  Node temp = head;
  Node oddStart = null; //ODD INDEX
  Node oddEnd = null;
  Node evenStart = null; //EVEN INDEX
  Node evenEnd = null;

  int i = 1;
  while(temp != null){

    if(i%2 ==0){
      //even
      if(evenStart == null){
        evenStart = temp;

      }
      else{
        evenEnd.next = temp;

      }
      evenEnd = temp;
    }
    else{
      //odd
      if(oddStart == null){
        oddStart = temp;
      }
      else{
        oddEnd.next = temp;
      }
      oddEnd = temp;
    }
    temp = temp.next;
    i++;
  }

  //now join the odd end with even start
  oddEnd.next = evenStart;
  //even end is new end so put NULL
  evenEnd.next = null;

  head = oddStart; //new head
}
}

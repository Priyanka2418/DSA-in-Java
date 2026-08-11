/*
Problem: Segregate Even and Odd Nodes in Linked List

TC: O(N)  We traverse the entire linked list only once to rearrange the nodes
SC: O(1) We do not use any extra data structures

*/

package src.LinkedList.MediumProblems_DLL;

public class p015segregateOdd_evenNodes_LL {
    public static Node segregateEvenOdd(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node evenHead = null;
        Node evenTail=null;

        Node oddHead= null;
        Node oddTail = null;

        Node current = head;
        while(current!=null){
            if(current.data%2==0){
                if(evenHead==null){
                    evenHead = evenTail = current;
                }else{
                    evenTail.next = current;
                    evenTail= current;
                }
            }else{
                if (oddHead == null) {
                    oddHead = oddTail = current;
                } else {
                    oddTail.next = current;
                    oddTail = current;
                }
            }
            current = current.next;
        }
        if (evenHead == null) {
            return oddHead;
        }

        // No odd nodes
        if (oddHead == null) {
            return evenHead;
        }

        // Connect even list with odd list
        evenTail.next = oddHead;

        // Terminate the final list
        oddTail.next = null;

        return evenHead;

    }
    public static void main(String[] args) {

    }
}

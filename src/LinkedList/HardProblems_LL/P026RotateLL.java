/*
Problem : Rotate a Linked List
TC: O(n)
SC: O(1)
 */
package src.LinkedList.HardProblems_LL;

public class P026RotateLL {
    public int calculateLength(Node head){
        if(head==null || head.next==null) return 0;

        Node current = head;
        int count =0;

        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }
    public Node rotateLL(Node head, int k ){
        int n = calculateLength( head);
         k = k% n ;
         if(k==0) return head;

         Node oldTail = head;
         while(oldTail!=null){
             oldTail= oldTail.next;
         }
         Node newTail = head;
         for(int i =1; i<n-k ; i++){
             newTail= newTail.next;
         }

         Node newHead= newTail.next;

         newTail.next= null;
         oldTail.next= head;
         return newHead;
    }
    public static void main(String[] args) {

    }
}

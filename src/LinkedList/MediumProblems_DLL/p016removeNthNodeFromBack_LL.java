/*
Problem :Remove Nth Node from the end of Linked list
TC: O(N) since the fast pointer traverse teh entire linked list;
SC: o(1) constant additional space is used
 */

package src.LinkedList.MediumProblems_DLL;

public class p016removeNthNodeFromBack_LL {
    public static Node removeNthNode(Node head, int N){

        Node dummy  = new Node(0,head);

        Node slow = dummy;
        Node fast= dummy;

        for(int i=0;i<N;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            while(fast.next != null){
                fast = fast.next;
                slow = slow.next;
            }
        }
        slow.next= slow.next.next;

        return dummy.next;
    }

    public static void main(String[] args) {

    }
}

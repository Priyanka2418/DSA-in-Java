/*
Problem : Find the middle of the LL
TC: 0(N/2) - The algorithm required  he fast pointer  to reach the end of the list which
             it does after N/2 iterations
SC: 0(1) -  There is a constant space complexity because it uses constant amount of extra space
            regardless of the size of Linked List.
 */
package src.LinkedList.MediumProblems_LL;

public class p09middle_LL {
    public Node middleNode(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast!=null){
            slow = slow.next;
            fast=fast.next.next;
        }
        return  slow;
    }
    public static void main(String[] args) {

    }
}

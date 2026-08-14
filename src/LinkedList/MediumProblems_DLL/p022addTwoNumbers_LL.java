/*
Problem: Add two numbers represented by Linked Lists

TC: O(max(n, m))
SC: O(max(n, m)) - result list
    O(1) auxiliary space
 */

package src.LinkedList.MediumProblems_DLL;

public class p022addTwoNumbers_LL {
    public Node addTwoNumbers(Node head1, Node head2){

        Node dummy = new Node(0);
        Node current = dummy;

        int carry =0;

        while(head1!=null || head2!=null || carry !=0 ){
            int sum =carry;
            if(head1!=null){
                sum+= head1.data;
                head1=head1.next;
            }
            if(head2!=null){
                sum+= head2.data;
                head2= head2.next;
            }
            current.next = new Node (sum%10);
            current =current.next;
            carry = sum /10;
        }
        return dummy.next;
    }
    public static void main(String[] args) {

    }
}

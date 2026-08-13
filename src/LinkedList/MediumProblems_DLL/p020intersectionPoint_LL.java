/*
Problem : Find intersection of Two Linked Lists
SC: O(2 × max(length of list1, length of list2)), Uses the same concept of difference of lengths of two lists.
TC: O(1), No extra data structure is used.
 */
package src.LinkedList.MediumProblems_DLL;

public class p020intersectionPoint_LL {
    public static Node intersectionNodes(Node head1, Node head2){
        Node d1= head1;
        Node d2= head2;

        while(d1!=d2){
            d1=d1==null?head2:d1.next;
            d2=d2==null? head1:d2.next;
        }
        return d1;
    }
    public void printList(Node head) {
        while (head != null && head.next != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        if (head != null) {
            System.out.print(head.data);
        }
        System.out.println();
    }
    public void insertNode(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public static void main(String[] args) {
        p020intersectionPoint_LL sol = new p020intersectionPoint_LL();

        // Creation of both lists
        Node head = new Node(1);
        sol.insertNode(head, 3);
        sol.insertNode(head, 1);
        sol.insertNode(head, 2);
        sol.insertNode(head, 4);
        Node head1 = head;
        head = head.next.next.next;  // Intersection point
        Node headSec = new Node(3);
        Node head2 = headSec;
        headSec.next = head;  // Creating intersection

        // Printing the lists
        System.out.print("List1: ");
        sol.printList(head1);
        System.out.print("List2: ");
        sol.printList(head2);

        // Checking if intersection is present
        Node answerNode = sol.intersectionNodes(head1, head2);
        if (answerNode == null) {
            System.out.println("No intersection");
        } else {
            System.out.println("The intersection point is " + answerNode.data);
        }
    }
}

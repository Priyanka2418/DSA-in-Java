/*
Problem : Delete the middle node of the linked list
SC: O(N/2) we traverse the entire LL using slow nad fast pointer , effectively covering about half of teh list;
TC: O(1) we have fixed number of pointers and variables to delete the node.
 */

package src.LinkedList.MediumProblems_LL;

public class p017DeleteMiddleNode {
    public static Node deleteMiddle(Node head){
        if(head==null || head.next==null){
            return null;
        }

        Node slow = head;
        Node fast = head.next.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
        }

        slow.next=slow.next.next;
        return head;
    }
    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(7);
        // Printing original list
        System.out.print("Original Linked List: ");
        printLL(head);

        // Deleting middle node
        head = deleteMiddle(head);

        // Printing updated list
        System.out.print("Updated Linked List: ");
        printLL(head);
    }
    }

/*
Problem : Sort the Linked List
SC: O(N*LogN), we recursively divide the linked list into two halves and then merge two sorted halves.
TC: O(1) constant additional space is required to sort teh entire Linked List

 */
package src.LinkedList.MediumProblems_DLL;

public class p018sort_LL {
    public Node findMiddle(Node head){
        if (head == null || head.next == null) {
            return head;
        }

        // Slow and fast pointers
        Node slow = head;
        Node fast = head.next;

        // Move fast twice as fast as slow
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Return middle node
        return slow;
    }
    public Node sortLL(Node head){
        if(head==null || head.next==null)
            return head;

        Node middle = findMiddle(head);
        Node right = middle.next;
        middle.next=null;
        Node left = head;
        left= sortLL(left);
        right =sortLL(right);

        return mergeTwoSortedLL(left,right);
    }
    public Node mergeTwoSortedLL(Node list1, Node list2){
        Node dummyNode = new Node(-1,null);
        Node temp = dummyNode;

        while(list1!=null && list2!=null){
            if(list1.data <= list2.data){
                temp.next=list1;
                list1=list1.next;
            }else{
                temp.next=list2;
                list2 = list2.next;
            }
            temp=temp.next;
        }
        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }
        return dummyNode.next;
    }
    public static void printLinkedList(Node head) {
        // Temp pointer to traverse
        Node temp = head;

        // Traverse and print nodes
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(3, null);
        head.next = new Node(2, null);
        head.next.next = new Node(5, null);
        head.next.next.next = new Node(4, null);
        head.next.next.next.next = new Node(1, null);

        // Print original list
        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Create Solution object
        p018sort_LL obj = new p018sort_LL();

        // Sort the linked list
        head = obj.sortLL(head);

        // Print sorted list
        System.out.print("Sorted Linked List: ");
        printLinkedList(head);
    }
}

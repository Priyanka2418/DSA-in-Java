/*
Problem : Check if the given Linked List is Palindrome
TC: : O(N), we traverse the list twice, once to reverse half of it and once to compare,
each taking O(N/2), which simplifies to O(N).
SC:  O(1), no extra space is used apart from few pointers
 */
package src.LinkedList.MediumProblems_LL;

public class p014palindromeCheck_LL {
    public static boolean palindromeCheck(Node head){
        if (head == null || head.next == null) {
            return true;  // It's a palindrome by definition
        }
        Node slow= head;
        Node fast= head;
        while(fast.next!=null && fast.next.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
        }
       Node newHead= reverseLinkedList(slow.next);
        Node first =head;
        Node second= newHead;
        while(second!=null){
            if(first.data!=second.data){
                reverseLinkedList(newHead);
                return false;
            }
            first=first.next;
            second=second.next;
        }
        reverseLinkedList(newHead);
        return true;
    }
    public static Node reverseLinkedList(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newHead = reverseLinkedList(head.next);
        Node front = head.next;
        front.next=head;
        head.next=null;
        return newHead;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(5);
        head.next.next = new Node(2);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(1);

        // Print the original linked list
        System.out.print("Original Linked List: ");
        printLinkedList(head);



        // Check if the linked list is a palindrome
        if (palindromeCheck(head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }

    // Function to print the linked list
    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");  // Print the current node's data
            temp = temp.next;                   // Move to the next node
        }
        System.out.println();
    }
}

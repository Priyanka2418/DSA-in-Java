package src.LinkedList.MediumProblems_LL;
class LinkedList1 {
    Node append(Node head, int value) {
        Node newNode = new Node(value);
        if (head == null) {
            return newNode;
        }
        Node current = head;
        while (current.next != null)
            current = current.next;
            current.next = newNode;
            return head;
    }

    void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            current = current.next;
        }
        System.out.println();
    }
}
public class p021addOne {
Node reverseList(Node node){
    Node prev =null;
    Node current = node;
    while(current!=null){
        Node nextNode = current.next;
        current.next= prev;
        prev= current;
        current= nextNode;
    }
    return prev;
    }
    Node addOne(Node head){
        head = reverseList(head);
        Node current = head;
        int carry =1;
        while(current!=null && carry>0){
            int sum = current.data + carry;
            current.data = sum % 10;
            carry = sum / 10;

            if (current.next == null && carry > 0) {
                current.next = new Node(carry);
                carry = 0;
            }
            current = current.next;
        }
        head = reverseList(head);
        return head;
    }
    public static void main(String[] args) {
        Node head = null;
        LinkedList1 ll = new LinkedList1();
        p021addOne sol = new p021addOne();

        // Example: Number 129 (1 -> 2 -> 9)
        head = ll.append(head, 1);
        head = ll.append(head, 2);
        head = ll.append(head, 9);

        System.out.print("Original Number: ");
        ll.printList(head);

        head = sol.addOne(head);

        System.out.print("After Adding One: ");
        ll.printList(head);
    }
}

package src.LinkedList.Learn_1D_LinkedList;

public class p03LengthOfTheLL {

    public static int lengthOfLinkedList(Node head) {

        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        int length = lengthOfLinkedList(head);

        System.out.println("Length = " + length);
    }
}
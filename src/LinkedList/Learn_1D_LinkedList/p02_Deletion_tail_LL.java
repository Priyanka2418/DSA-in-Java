package src.LinkedList.Learn_1D_LinkedList;

public class p02_Deletion_tail_LL {
    public static Node deleteTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node current= head;
        while(current.next.next!=null){
            current= current.next;
        }
        current.next=null;
        return head;
    }

    public static void main(String[] args) {
        Node head= new Node(1);
        head.next= new Node(2);
        head.next.next= new Node(3);

        deleteTail(head);

        Node temp = head;
        while(temp !=null){
            System.out.print(temp.data+ " ");
            temp= temp.next;
        }
    }
}

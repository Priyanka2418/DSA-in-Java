package src.LinkedList.Learn_1D_LinkedList;

public class p01InsertionAtTheHeadOfLL {
    public Node insertAtHead(Node head, int newData){
        Node newNode= new Node(newData,head);
        return newNode;
    }
    public void printList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        p01InsertionAtTheHeadOfLL sol = new p01InsertionAtTheHeadOfLL();
        Node head= new Node(2);
        head.next= new Node(3);
        System.out.print("Original list: ");
        sol.printList(head);

        head = sol.insertAtHead(head,1);
        System.out.print("After insertion At head: ");
        sol.printList(head);
    }
}

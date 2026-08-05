package src.LinkedList.Learn_DoublyLinkedList;
public class p07DeleteHead_DLL {
    public static Node deleteTail(Node head){
        if(head==null || head.next==null)return null;
        Node temp =head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.prev.next=null;
      return head;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;

        System.out.println(deleteTail(head));

        System.out.println("after deletion");
        Node current=head;
        while(current!=null){
            System.out.print(current.data + " ");
            current=current.next;
        }

    }
}

package src.LinkedList.MediumProblems_DLL;



public class p010_reverse_LL {
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public static Node reverseList(Node head){
        Node prev = null;
        Node temp =head;
        while(temp!=null){
            Node front = temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    public static void main(String[] args) {
        Node head= new Node(1);
        head.next=new Node(2);
        head.next.next= new Node(3);
        head.next.next.next= new Node(4);

        Node newHead= reverseList(head);
        while(newHead!=null){
            System.out.print(newHead.data + " ");
            newHead = newHead.next;
        }
        System.out.println();
    }
}

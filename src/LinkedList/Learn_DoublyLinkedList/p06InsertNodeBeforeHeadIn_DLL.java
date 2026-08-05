package src.LinkedList.Learn_DoublyLinkedList;

public class p06InsertNodeBeforeHeadIn_DLL {
    public static Node convertArr2DLL(int[]arr){
        Node head= new Node(arr[0]);
        Node prev= head;
        for(int i =1;i< arr.length;i++){
            Node temp = new Node(arr[i], null, prev);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }
    public static void print(Node head) {
        // Traverse through the list and print each node's data
        while (head != null) {
            System.out.print(head.data + " ");  // Print the data of the current node
            head = head.next;  // Move to the next node
        }
        System.out.println();  // New line after printing the list
    }
    public static Node insertAtTail(Node head, int k ){
        Node newNode = new Node(k);
        if(head==null){
            return newNode;
        }
        Node tail = head;
        while(tail.next!= null){
            tail = tail.next;
        }
        tail.next = newNode;
        newNode.prev=tail;
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {12, 5, 8, 7, 4};
        Node head = p06InsertNodeBeforeHeadIn_DLL.convertArr2DLL(arr);

        System.out.println("Doubly Linked List Initially: ");
        System.out.println(head);

        System.out.println("\nDoubly Linked List After Inserting at the tail with value 10: ");
        head = p06InsertNodeBeforeHeadIn_DLL.insertAtTail(head, 10);
        System.out.println(head);
    }
}

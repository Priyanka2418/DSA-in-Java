package src.LinkedList.Learn_DoublyLinkedList;

class Node{
    int data;
    Node next;
    Node prev;


    public Node( int data, Node next, Node prev) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
    public Node(int data1){
        data=data1;
        next=null;
        prev=null;
    }
}

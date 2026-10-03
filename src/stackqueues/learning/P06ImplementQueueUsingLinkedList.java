package src.stackqueues.learning;

public class P06ImplementQueueUsingLinkedList {
    private Node head;
    private Node rear;
     private int size;

     public P06ImplementQueueUsingLinkedList(){
         head=null;
         rear= null;
         size=0;
     }

     public void enqueue(int x) {
         Node newNode = new Node(x);
         if (head == null) {
             head = rear = newNode;
         } else {
             rear.next = newNode;
             rear = newNode;
         }
         size++;
     }
     public void dequeue(){
         if(head==null){
             return;
         }
         head = head.next ;
         size--;
         if(head == null){
             rear =null;
         }
     }
    public int getFront() {
        if(head==null) return -1;
        return head.data;
    }

    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return (size==0);
    }
    public static void main(String[] args) {

            P06ImplementQueueUsingLinkedList q = new P06ImplementQueueUsingLinkedList();

            q.enqueue(10);
            q.enqueue(20);
            q.enqueue(30);

            System.out.println(q.getFront());  // 10
            System.out.println(q.size());      // 3

            q.dequeue();

            System.out.println(q.getFront());  // 20
            System.out.println(q.size());      // 2

            q.dequeue();
            q.dequeue();

            System.out.println(q.isEmpty());   // true

    }
}

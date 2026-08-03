package src.LinkedList.Learn_1D_LinkedList;

public class p04searchIn_LL {
    public static boolean searchInLL(Node head, int key){
        if(head==null || head.next==null)
            return false;

        Node current = head;
        while (current!=null){
            if(current.data==key){
                return  true;
            }
            current=current.next;
        }
        return false;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        if(searchInLL(head, 40)){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }
}

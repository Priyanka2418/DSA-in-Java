package src.LinkedList.Learn_DoublyLinkedList;

public class p08ReverseDLL {
    public static Node covertArr2DLL(int []arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i =1;i< arr.length;i++){
            Node temp = new Node(arr[i],null, prev);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }
    public static Node reverseDLL(Node head){
        Node cuurent= head;
        Node last = null;
        while(cuurent!=null){
            Node temp =cuurent.next;
            cuurent.next = cuurent.prev;
            cuurent.prev= null;

            last = cuurent;
            cuurent = temp;
        }
        return last;
    }
    public static void printDLL(Node head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        Node head = p08ReverseDLL.covertArr2DLL(arr);
        System.out.print("Original DLL: ");
        p08ReverseDLL.printDLL(head);

        // Reverse the DLL
        Node reversed = p08ReverseDLL.reverseDLL(head);

        // Print the reversed DLL
        System.out.print("Reversed DLL: ");
        p08ReverseDLL.printDLL(reversed);
    }
}


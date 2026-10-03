package src.stackqueues.learning;

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next =null;
    }
}
public class P05ImplementStackUsingLinkedList {
    private Node head;
    private int size;

    public P05ImplementStackUsingLinkedList() {
        head = null;
        size = 0;
    }

    public void push(int x) {
        Node newElement = new Node(x);
        newElement.next = head;
        head = newElement;
        size++;
    }

    public int pop() {
        if (head == null) {
            return -1;
        }
        int value = head.data;
        Node temp = head;
        ;
        head = head.next;
        size--;
        return value;
    }

    public int top() {

        if (head == null) {
            return -1;
        }

        return head.data;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public static void main(String[] args) {
        P05ImplementStackUsingLinkedList st = new P05ImplementStackUsingLinkedList();
        String[] commands = {"LinkedListStack", "push", "push",
                "pop", "top", "isEmpty"};
        int[][] inputs = {{}, {3}, {7}, {}, {}, {}};
        for (int i = 0; i < commands.length; ++i) {
            if (commands[i].equals("push")) {
                st.push(inputs[i][0]);
                System.out.print("null ");
            } else if (commands[i].equals("pop")) {
                System.out.print(st.pop() + " ");
            } else if (commands[i].equals("top")) {
                System.out.print(st.top() + " ");
            } else if (commands[i].equals("isEmpty")) {
                System.out.print((st.isEmpty() ? "true" : "false") + " ");
            } else if (commands[i].equals("LinkedListStack")) {
                System.out.print("null ");
            }
        }
    }
}
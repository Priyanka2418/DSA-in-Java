/*
Problem :  Sort a Linked List of 0's 1's and 2's by changing links
TC : O(n), We traverse the entire list once.
SC : O(1), Only dummy nodes and pointers are used (constant space).
 */
package src.LinkedList.MediumProblems_DLL;
class LinkedList{
    Node head;
    LinkedList(){
        head=null;
    }
    void insert(int data){
        Node newNode= new Node(data);
        if(head==null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null) {
            temp = temp.next;
        }
            temp.next = newNode;
    }
    void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println(" -> NULL");
    }
    }

public class p019sort_0s1s2s_LL {
    public void sortZerOneTwo(LinkedList l1){
        Node zeroDummy = new Node(-1);
        Node oneDummy = new Node(-1);
        Node twoDummy = new Node(-1);

        Node zeroTail = zeroDummy;
        Node oneTail = oneDummy;
        Node twoTail = twoDummy;

        Node curr = l1.head;

        while (curr != null) {
            if (curr.data == 0) {
                zeroTail.next = curr;
                zeroTail = zeroTail.next;
            } else if (curr.data == 1) {
                oneTail.next = curr;
                oneTail = oneTail.next;
            } else {
                twoTail.next = curr;
                twoTail = twoTail.next;
            }
            curr = curr.next;
        }

        zeroTail.next = oneDummy.next != null ? oneDummy.next : twoDummy.next;

        if (oneDummy.next != null) {
            oneTail.next = twoDummy.next;
        }

        twoTail.next = null;

        l1.head = zeroDummy.next;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        p019sort_0s1s2s_LL sol = new p019sort_0s1s2s_LL();

        // Inserting nodes into linked list
        ll.insert(1);
        ll.insert(2);
        ll.insert(0);
        ll.insert(1);
        ll.insert(2);
        ll.insert(0);

        System.out.println("Original List:");
        ll.print();

        // Sorting the list
        sol.sortZerOneTwo(ll);

        System.out.println("Sorted List:");
        ll.print();
    }
}

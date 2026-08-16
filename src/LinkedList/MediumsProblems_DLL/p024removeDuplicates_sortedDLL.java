/*
Problem : Remove duplicates from sorted DLL
 TC: O(n), Every node is visited exactly once.
 SC:  O(1), No extra space is used.
 */

package src.LinkedList.MediumsProblems_DLL;

public class p024removeDuplicates_sortedDLL {
    Node head = null;

    public void insertAtEnd(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }


        current.next = newNode;
        newNode.prev = current;
    }

    public void printList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public Node removeDuplicates(Node head){
        Node current = head;

        while(current!=null && current.next!=null){
            Node nextNode = current.next;
          while(nextNode!=null && nextNode.data ==current.data){
              nextNode = nextNode.next;
          }
          current.next = nextNode;
          if(nextNode!=null){
              nextNode.prev = current;
          }
          current=current.next;
        }
        return head;
    }
    public static void main(String[] args) {
        p024removeDuplicates_sortedDLL sol = new p024removeDuplicates_sortedDLL();

        // Initial list values (with duplicates)
        int[] values = {1, 2, 2, 2, 3, 4, 4, 5, 5, 6};

        for (int value : values) {
            sol.insertAtEnd(value);
        }

        // Print the original list
        System.out.print("Original List: ");
        sol.printList();

        // Remove duplicate nodes
        sol.removeDuplicates(sol.head);

        // Print the updated list
        System.out.print("After Removing Duplicates (keeping 1 occurrence): ");
        sol.printList();
    }
}

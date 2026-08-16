/*
Problem: Delete all occurrences of a key in DLL

TC: O(n), Every node is visited once.
SC: O(1) We do not use any extra data structures
*/


package src.LinkedList.MediumsProblems_DLL;
class Node {
    int data;
    Node prev;
    Node next;

    Node(int val){
        data = val;
        prev=null;
        next=null;
    }
}
public class p023deleteAllOccurence_key_DLL {
    public void insertAtEnd(Node[] headRef, int val) {
        // Create the new node
        Node newNode = new Node(val);

        // If list is empty, set new node as head
        if (headRef[0] == null) {
            headRef[0] = newNode;
            return;
        }

        // Traverse to the last node
        Node temp = headRef[0];
        while (temp.next != null)
            temp = temp.next;

        // Link the new node at the end
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void printList(Node head) {
        // Start from the head node
        Node temp = head;

        // Traverse and print each node's data
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print(" <-> ");
            temp = temp.next;
        }
        System.out.println();
    }
    public Node deleteTargetNodes(Node head, int target){
        Node current = head;
        while(current!=null){
            Node nextNode = current.next;
            if(current.data==target) {
                if (current.prev != null)
                    current.prev.next = current.next;
                else
                    head = current.next;

                if (current.next != null)
                    current.next.prev = current.prev;
            }
                current = nextNode;

            }
        return  head;
    }
    public static void main(String[] args) {
        p023deleteAllOccurence_key_DLL sol = new p023deleteAllOccurence_key_DLL();
        Node[] headRef = new Node[1];

        // Insert sample values into the list
        sol.insertAtEnd(headRef, 1);
        sol.insertAtEnd(headRef, 2);
        sol.insertAtEnd(headRef, 3);
        sol.insertAtEnd(headRef, 2);
        sol.insertAtEnd(headRef, 4);
        sol.insertAtEnd(headRef, 2);
        sol.insertAtEnd(headRef, 5);

        // Print the original list
        System.out.println("Original List:");
        sol.printList(headRef[0]);

        // Delete all nodes with value 2
        int target = 2;
        headRef[0] = sol.deleteTargetNodes(headRef[0], target);

        // Print the updated list
        System.out.println("\nList after deleting value " + target + ":");
        sol.printList(headRef[0]);
    }
    }

// Approach:
// Use Floyd's Cycle Detection Algorithm (Slow and Fast Pointer).
// Slow moves one step, while Fast moves two steps.
// If slow and fast meet, a cycle exists.
// If fast reaches null, there is no cycle.

// Time Complexity: O(n)
// Space Complexity: O(1)
package src.LinkedList.MediumProblems_DLL;

public class p011detectLoop_LL {
    public static boolean detectLoop(Node head){
        Node slow =head;
        Node fast = head;
        while(fast!=null && fast.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        // Connect nodes
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Create a loop
        fifth.next = third;

        // Check for loop
        if (detectLoop(head)) {
            System.out.println("Loop detected in the linked list.");
        } else {
            System.out.println("No loop detected in the linked list.");
        }
    }
}

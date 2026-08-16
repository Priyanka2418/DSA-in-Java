// Approach:
// 1. Use slow and fast pointers to detect a cycle.
// 2. If they meet, move slow back to head.
// 3. Move both pointers one step at a time.
// 4. The node where they meet is the starting point of the cycle.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

package src.LinkedList.MediumProblems_LL;

public class p012startingPoint_LL {
    public static Node detectCycle(Node head){
        Node slow= head;
        Node fast= head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(-4);
        head.next.next.next.next = head.next;
        Node result = detectCycle(head);
        if (result != null)
        {
            System.out.println("Cycle starts at node with value: " + result.data);
        } else {
            System.out.println("No cycle found.");
        }
    }
}
